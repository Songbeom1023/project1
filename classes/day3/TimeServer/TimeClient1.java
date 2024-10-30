package classes.day3.TimeServer;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TimeClient1 extends Thread {
    //다른 클래스의 화면에서 TimeClient1이 청취한 현재 시분초 문자열을 출력하는 문제 이므로 JLabel 이라는 UI 클래스를 선언

   private JLabel label = null;

    public TimeClient1(){}
    public TimeClient1(JLabel jlb_timer){
        this.label = jlb_timer;
    }

    // run() 시작
    public void run() {
        Socket socket = null;
        PrintWriter out = null;
        BufferedReader in = null;
        String timeStr = null;

        try {
            socket = new Socket("localhost", 2008);//-> 서버에 연결 요청
            //localhost = 서버의 IP 주소, port -> 서버에서 결정한 port
            //Socket 이 생성된 후 OutputStream, InputStream 작동
            out = new PrintWriter(socket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            //

            while(true) {
                System.out.println("while(true)");
                while((timeStr = in.readLine()) != null) {
                    System.out.println(timeStr);
                    label.setText(timeStr);
                }
                try {
                    Thread.sleep(1000);
                } catch(InterruptedException i) {}
            }

        } catch(IOException i) {
            label.setText("타임서버에 접속할 수 없습니다.");
        } finally {
            try {
                in.close();
                out.close();
                socket.close();
            } catch (IOException e) {}
        }
    }
    // run() 종료
    public static void main(String args[]) {
        TimeClient1 tc = new TimeClient1();
        tc.start();//run 메소드를 직접 호출하지 않고, start 로 호출. 자바가 정해놓은 루틴
    }
}
