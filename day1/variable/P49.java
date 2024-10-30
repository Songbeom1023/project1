package day1.variable;

public class P49 {
    static int hap(int i, int j){
        return  i+j;
    }
    public static void main(String[] args) {
        System.out.println(hap(1,2));
        String a = "아이패드에";
        a = "갤럭시탭에";//변수는 한 번에 하나만 기억할 수 있음. 따라서 아이패드가 아닌 갤럭시탭으로 재정의됨.
        String b = "출력";
        System.out.println("화면출력");
        System.out.println("화면출력");
        System.out.println(a+" "+b);
        System.out.println(a+" "+b);
        System.out.println(a+" "+b);
    }
}
