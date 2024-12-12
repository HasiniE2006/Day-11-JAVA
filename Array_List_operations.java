import java.util.*;
class Array_List_operations
{
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        System.out.println(a);
        //adding 
        a.add(1,789);
        //modifying
        a.set(2,64);
        System.out.println(a);
    }
}
