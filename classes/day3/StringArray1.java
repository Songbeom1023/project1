package classes.day3;

public class StringArray1 {
    public static void main(String[] args) {
        String[] names = null;//선언
        names = new String[3];//3개의 공간에 null 이 들어있음.
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        StringArray1[] sas = new StringArray1[3];
        StringArray1 sa = new StringArray1();
        System.out.println(sa);
        sas[0] = sa;
        sas[1] = sa;
        sas[2] = sa;
        System.out.println(sas[0]==sa);
        System.out.println(sas[1]==sa);
        System.out.println(sas[2]==sa);
    }
}
