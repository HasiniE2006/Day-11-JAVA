import java.util.*;
public class  Print_ArrayList {
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
        for(int i=0;i<n;i++)
        System.out.println(a.get(i)+" ");
    }
}

