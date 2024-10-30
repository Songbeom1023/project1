import athread.talk4.ServerThread;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    List<ServerThread> list = new ArrayList<>();
    private ServerSocket serverSocket;
    public static int count;

    Server(){
        startServer();
    }

    void startServer() {
        try {
            System.out.println("hello");
            int port = 5000;
            serverSocket = new ServerSocket(port);
            System.out.println("Server started at port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected");
                // 각 클라이언트 소켓을 사용하여 ServerThread를 생성하고 리스트에 추가
                ServerThread thread = new ServerThread(clientSocket);
                list.add(thread);
                System.out.println("Active connections: " + list.size());
                thread.start();
                count++;

            }

        } catch (IOException e) {
            System.out.println("Server Error");
            throw new RuntimeException(e);
        }finally {
            closeResources();
        }
    }

        // 자원 반납 메서드
        private void closeResources() {
            try {
                // 각 클라이언트 스레드의 자원 반납
                for (ServerThread clientThread : list) {
                    clientThread.close();  // ServerThread 클래스에 close 메서드가 필요합니다.
                }
                // 서버 소켓 자원 반납
                if (serverSocket != null && !serverSocket.isClosed()) {
                    serverSocket.close();
                }
                System.out.println("Server resources released.");
            } catch (IOException e) {
                System.out.println("Error closing server resources: " + e.getMessage());
            }

        }

    public static void main(String[] args) {
        new Server();
    }

    }



