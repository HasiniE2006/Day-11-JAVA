import java.util.*;
public class Mini_Max {
    public static void main(String[] args) {
        int s=0;
        ArrayList <Integer> arr=new ArrayList<>();
        arr.add(103);
        arr.add(21);
        arr.add(312);
        arr.add(76);
        Collections.sort(arr);
        int n=arr.size();
        for(int i=0;i<n;i++)
        s+=arr.get(i);
        System.out.println((s-arr.get(n-1))+" "+(s-arr.get(0)));
    }
}
