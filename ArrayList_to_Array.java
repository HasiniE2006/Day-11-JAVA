import java.util.*;
public class ArrayList_to_Array {
    public static void main(String[] args) {
        ArrayList <Integer> a=new ArrayList<>();
        a.add(233);
        a.add(321);
        a.add(211);
        int b[]=new int[a.size()];
        for(int i=0;i<a.size();i++)
        b[i]=a.get(i);
        System.out.println(Arrays.toString(b));
    }
}
