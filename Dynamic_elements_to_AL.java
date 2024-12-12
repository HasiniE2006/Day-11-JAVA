import java.util.*;
public class Dynamic_elements_to_AL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Accepting array
        int n=sc.nextInt();
        ArrayList <Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int s=sc.nextInt();
            a.add(s);
        }
        a.add(89);
        System.out.println(a);
    }
}
