package work.sayno.www;

import java.util.ArrayList;
import java.util.List;

public class Basic {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.forEach(System.out::println);
    }
}
