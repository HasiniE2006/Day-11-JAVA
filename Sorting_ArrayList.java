import java.util.*;
public class Sorting_ArrayList {
    public static void main(String[] args) {
        ArrayList <Integer> a =new ArrayList<>();
        a.add(314);
        a.add(224);
        a.add(1123);
        a.add(10);
        Collections.sort(a);
        System.out.println(a);
    }
}
