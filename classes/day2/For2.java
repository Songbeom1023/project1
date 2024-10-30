package classes.day2;

public class For2 {
    public static void main(String[] args) {
        int i,hap = 0;
        for(i=1;i<=5;i++){
            hap = hap + i;
            System.out.printf("i:%d hap:%d%n",i,hap);
        }
        System.out.println("1부터 5까지 합"+hap);
        hap = 0;/////////////초기화 꼭 필요!!!!!!!!!!!!!!!!!!!!

        for(i=1;i<=5;i++){
            if (i%2==1){//어떤 숫자를 2로 나눈 나머지가 0인가? -> 짝수
                hap = hap + i;
            }
        }
        System.out.println("1부터 5까지 홀수의 합"+hap);
    }
}
