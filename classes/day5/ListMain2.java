package classes.day5;

import java.util.ArrayList;
import java.util.List;

public class ListMain2 {
    public static void main(String[] args) {
        List <String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list.size());
        boolean isOk = list.remove("B");
        System.out.println(isOk);
        String result = list.remove(1);
        System.out.println(result);
        System.out.println(list.isEmpty());
        if(list.contains("A")){
            System.out.println("A가 있다");
        } else
            System.out.println("A가 없다");
    }
}
