package classes.day4;

public class TryCatch {
    public static void main(String[] args) {
        int is [] = new int[3];
 //-> 실행되어야 할 중요한 코드가 있을 수 있음 -> 후처리(예외가 발생할 경우를 대비)
        try{
            System.out.println(is[2]);
        }
        catch (Exception e){
            System.out.println("예외 발생"+e.toString());
        }
        System.out.println("여기까지 실행 기회가 오지않음");
    }
}
