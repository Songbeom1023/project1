package Quiz.step1;

public class Q27_1 {
    //index 값 관리를 잘해야 함.
    public static void main(String[] args) {
        int deptnos[]= null;
        try {
            deptnos= new int[3];
            System.out.println(deptnos[2]);
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }finally {
            System.out.println("예외와 상관없이 무조건 출력");
        }
    }
}
