package athread.talk2;

import java.util.StringTokenizer;

public class StringMsg {
    public static void main(String[] args) {
        String msg = "200#키위#사과#오늘스터디할까요?";
        StringTokenizer st = new StringTokenizer(msg,"#");
        String protocol = st.nextToken();//200이 저장 됨.
        String me = st.nextToken();//키위
        String you = st.nextToken();//사과
        String message = st.nextToken();//오늘스터디할까요?
        System.out.println(protocol);
        System.out.println(me);
        System.out.println(you);
        System.out.println(message);
    }
}

