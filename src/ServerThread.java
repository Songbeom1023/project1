import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
    private Socket socket;
    private ObjectOutputStream oos;
    private ObjectInputStream ois;

    public ServerThread(Socket socket) {
        this.socket = socket;
        try{
            ois = new ObjectInputStream(socket.getInputStream());
            oos = new ObjectOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void run() {
        try{
            ServerThread serverThread = new ServerThread(socket);
            serverThread.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    // 자원 반납 메서드
    public void close() {
        try {
            if (ois != null) ois.close();
            if (oos != null) oos.close();
            if (socket != null && !socket.isClosed()) socket.close();
        } catch (IOException e) {
            System.out.println("Error closing client resources: " + e.getMessage());
        }
    }

}
