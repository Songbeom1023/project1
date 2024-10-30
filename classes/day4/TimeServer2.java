package classes.day4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TimeServer2 extends Thread{

    public void init(){
        int port = 5000;

        //네트워크와 관련된 클래스들은 외부의 영향으로 오류가 날 수 있으므로 예외 처리를 해야 함.
        try{
            //예외가 발생할 가능성이 있는 코드를 쓴다.
            ServerSocket ss = new ServerSocket(5000);
            //반복문으로 대기
            while(true){
                //다음 코드가 실행되지 않고 있다면, new Socket(ip,port); 하지 않은 것
                Socket s = ss.accept();//클라이언트의 소켓을 받아옴.
                //소켓을 이용해 Inputstream, Outputstream 생성해야 함
                System.out.println("new client connected..."+s.getInetAddress());
            }
        }catch (IOException e){}
    }

    public static void main(String[] args) {
        TimeServer2 ts2 =new TimeServer2();
        ts2.init();
        ts2.start();
    }
}
