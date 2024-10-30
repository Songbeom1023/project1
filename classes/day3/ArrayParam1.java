package classes.day3;

public class ArrayParam1 {
    void methodA(String[] names) {
        for (int i = 0; i<names.length; i++) {
            System.out.println(names[i]);
        }
    }
    public static void main(String[] args) {
        ArrayParam1 ap = new ArrayParam1();
        String[] names = {"강감찬","이순신","김유신"};
        ap.methodA(names);
        System.out.println("methodA가 다 처리되면 여기로 온다");
    }
}
