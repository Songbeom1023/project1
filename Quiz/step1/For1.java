package Quiz.step1;

import javax.swing.*;

public class For1 {
    public static void main(String[] args) {
        int is[] = {1,2,3};
        for(int i : is){
            System.out.println(i);
        }
        String [] names = {"홍길동","김유신","강감찬"};
        for(String s : names){
            System.out.println(s);
        }
        JButton[] btns = new JButton[3];
        btns[0] = new JButton();
        for(JButton b : btns){
            System.out.println(b);
        }
        Object ob = new String("Hello");
        //for(String o : ob){
           // System.out.println(o);
        //}
    }
}
