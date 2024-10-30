package classes.day3.TimeServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;

public class TimeServer1 extends Thread {

    private Socket socket;

    public TimeServer1(Socket s) {//s -> main()의 client
        this.socket = s;//this
    }

    // run() 시작
    public void run() {//start() 호출되면, JVM 이 알아서 호출해줌.
        System.out.println("run call....");
        try {
            //PrintWriter out : 출력할 때 사용. socket 과 의존 관계
            //-> socket 이 null 이면, PrintWriter 가 생성이 안 됨.
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            //BufferedReader : 듣기에 사용.
            //-> 듣기 성능 향상을 위한 필터 스크린. 실제 듣기를 제공하는 클래스는 InputSpringReader
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    socket.getInputStream()));
            while(true) {
                out.println(getTimeStr());//현재 시간을 읽어와서 출력을 내보냄.
                try {
                    sleep(1000);//millisecond 단위. 1000 = 1초
                } catch(InterruptedException i) {}
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("\nClient disconnected...\n");
            try {
                socket.close();
            } catch(IOException e) {}
        }
    }
    // run() 종료

    // getTimeStr() 시작
    //현재 서버 컴퓨터의 시간을 반환하는 메소드
    private String getTimeStr() {
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);

        //삼항 연산자
        return (hour < 10 ? "0" + hour : "" + hour) + ":" +
                (min < 10 ? "0" + min : "" + min)  +	":" +
                (sec < 10 ? "0" + sec : "" + sec) ;
    }
    // getTimeStr() 종료

    // main() 시작

    public static void main(String args[]) {
        int port = 2008;//클라이언트가 서버에 접속할 포트 번호 결정 -> IP 주소, 포트 번호는 서버에 접속할 수 있도록 서버 것으로 설정
        //***주의 : "서버소켓"은 듣고 말하기에 전혀 관여하지 않음.
        ServerSocket server = null;//동시에 "여러 사용자"를 받는 소켓
        Socket client = null;//듣고 말하기에 관여하는 소켓
        //위의 소켓이 있어야 InputString, OutputString 생성 가능
        //-> 서로 의존관계에 있음 -> 없으면(null), 생성이 불가

        try {//try-catch : 예외 사항이 있어야 작용 -> 예외가 발생하지 않으면 catch 아래에 있는 모든 코드는 실행되지 않는다.
            server = new ServerSocket(port);// 서버 소켓 호출 -> 포트 번호를 주입 받음
        } catch(IOException e) {
            //프로그램의 임의 중단을 막고, 예외가 발생하더라도 반드시 해야할 후처리가 있다.
            //후처리를 위해 예외처리는 필수
            System.out.println("Can't bind port: " + port);
            e.printStackTrace();
            try {
                //사용한 자원에 대해서는 반드시 명시적으로 반환 처리함.
                //open 되어 있으면 불순한 목적으로 위변조를 할 수 있음.
                server.close();
            } catch(IOException i) {}
            System.exit(1);
        }
        System.out.println("Time Server started successfully...");

        while(true) {//반복문. 파라미터에 true 가 있음 -> 무한 반복 -> "서버"이므로
            try {
                //이 지점에서 기다림 발생, 사용자가 new Socket(ip, port)할 때까지
                client = server.accept();//클라이언트의 접속 요청 받아들임. -> 접속이 들어오면 낚아챔. "스레드" 등장
                System.out.println("New Client connected...");
                //this는 쓸 수 없음. main 메소드 안이기 때문.
                //client 는 Socket 타입. -> 이것이 있어야 말하고 듣기가 가능
                //왜 생성자 파라미터로 넘기는가? 다른 사용자 정의 메소드에서 쓰기 위해서
                TimeServer1 tServer = new TimeServer1(client);//생성자 호출
                tServer.start();
                //스레드가 동작하는 run 메소드를 호출해줌.
                //사용자가 직접 스레드를 컨트롤하지 못함.
                //결합도를 낮추기 위해서 -> 결합도가 높으면, 재사용성이 떨어짐
                //결합도가 높으면 단위 테스트와 통합 테스트가 어려워짐.
                //코드의 양은 늘어나더라도 복잡도가 증가하지 않도록 코딩하기
                System.out.println("New Time Server Thread started...");
            } catch(IOException e) {
                System.out.println("Can't start server thread!!");
                e.printStackTrace();
                try {
                    client.close();
                } catch(IOException i) {}
            }
        }
    }
    // main() 종료
}
/*
프로그램 동작 과정
1. 서버는 2009번 포트에서 클라이언트 연결을 기다린다.
server = new ServerSocket(2008);//1~65570 사이의 숫자를 사용함
단, 1~1023번까지는 윈도우 운영체제가 사용하므로 피한다.
2. 클라이언트가 연결되면 새로운 스레드가 생성되어 해당 클라이언트에게 1초마다 현재 시간을 전송한다.
-> 객체를 생성할 때 서버소켓에 접속을 시도하게 된다. 다른 코드는 필요 없음.
3. 클라이언트가 연결을 종료하면, 해당 스레드는 종료된다.
스레드 클래스가 사용자에 대해 라이프사이클을 관리 -> 생성 - 활용 - 죽음
4. 서버는 새로운 클라이언트가 연결될 때까지 계속 대기하며 연결이 될 때마다 새로운 스레들르 생성한다. -> "깊은 복사"
 */
