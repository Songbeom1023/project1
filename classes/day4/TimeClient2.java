package classes.day4;

import java.net.Socket;

public class TimeClient2 {
    public void init(){
        try {
            Socket socket = new Socket("192.168.0.69",5000);
        } catch (Exception e) {
            System.out.println(" 예외 발생"+e.toString());
        }
    }

    //main thread
    public static void main(String[] args) {
        TimeClient2 tc2 = new TimeClient2();
        tc2.init();
    }
}
