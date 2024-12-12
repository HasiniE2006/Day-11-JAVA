import java.util.*;
public class Linked_List {
    public static void main(String[] args) {
        LinkedList <Integer> a=new LinkedList<>();
        a.add(567);
        a.add(23);
        a.add(435);
        System.out.println(a);
        a.addFirst(89);
        System.out.println(a);
        a.addLast(24);
        System.out.println(a);
    }
}
