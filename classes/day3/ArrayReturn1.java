package classes.day3;

public class ArrayReturn1 {
    String names[] = {"김유신", "이성계", "강감찬"};

    String[] methodA() {
        return names;
    }

    public static void main(String[] args) {
        ArrayReturn1 ar = new ArrayReturn1();
        String[] names = ar.methodA();
        names[1] = "김춘추";
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
