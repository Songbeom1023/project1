package classes.day3;

public class String1 {
    public static void main(String[] args) {
        String mem_id1 = "kiwi";
        String mem_id2 = "kiwi";
        String mem_id3 = new String("kiwi");
        String mem_id4 = new String("tomato");
        System.out.println(mem_id1==mem_id2);//주소번지가 같냐
        System.out.println(mem_id1==mem_id3);
        System.out.println(mem_id2==mem_id3);
        System.out.println(mem_id3==mem_id4);
        System.out.println(mem_id1.equals(mem_id2));//값이 같냐
        System.out.println(mem_id1.equals(mem_id3));
        System.out.println(mem_id3.equals(mem_id4));
    }
}
