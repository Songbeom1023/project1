package classes.day2;

public class Array12 {
    public static void main(String[] args) {
        String[][] datas = new String[2][3];
        String msg = null;
        System.out.println(datas[1][2]);
        System.out.println(datas[0][1]);
        System.out.println(datas[1][0]);
        //선언 및 초기화를 한 번에 할 수 있음.
        String[][] names = {{"aaa","bbb","ccc"}, {"ddd","eee","fff"}};
        System.out.println(names[1][2]);
        System.out.println(names[0][1]);
        System.out.println(names[1][0]);
        //배열의 단점은 같은 타입만 담을 수 있다
        //다른 타입을 담고 싶다면 Object 클래스를 활용
        //대입연산자 오른쪽에 더 작은 타입이 오는 것은 가능하나, 더 큰 타입이 오는 것은 성립하지 않는다.
        //이럴 경우 그 숫자가 계산식에 사용된다면 모두 형 전환을 해야 한다.
        String[][] msgs = new String[][]{
                {"안녕", "내일 봐", "점심 뭐 먹을까"},{"무슨 영화 좋아해", "커피 마실까","스터디 해요"}
        };
        System.out.println(msgs[1][2]);
        System.out.println(msgs.length);// 행 수
        System.out.println(msgs[0].length);// 열 수
    }
}
