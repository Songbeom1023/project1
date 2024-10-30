package day1.variable;

public class a1 {
    public static void main(String[] args) {
        String address;//변수 선언
        address = "서울시 종로구 공덕동";
        System.out.println(address);
        address = "서울시 금천구 가산동";
        System.out.println(address);
        address = "서울시 영등포구 당산동";
        System.out.println(address);//지변인데 초기화를 하지 않아서 에러(컴파일 되지 않음) 발생.
        //그러면 a1.java는 존재하지만 a1.class는 생성되지 않음.
        //어디서 확인 가능??? out\production\day1\variable
        //***순서, 위치 중요!!! 선언 -> 초기화 -> 사용

    }
}
