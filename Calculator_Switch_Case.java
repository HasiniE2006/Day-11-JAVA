import java.util.*;
class Main {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
            void Sum()
            {
                int c=a+b;
                System.out.println(c);
            }
            void Sub()
            {
                int c=a-b;
                System.out.println(c);
            }
            void Mul()
            {
                int c=a*b;
                System.out.println(c);
            }
            void Div()
            {
                int c=a/b;
                System.out.println(c);
            }
            void Mod()
            {
                int c=a%b;
                System.out.println(c);
            }

        }
class Calculator_Switch_Case
{
    public static void main(String args[])
    {
    Main r=new Main();
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    switch(x)
    {
    case 1:
        r.Sum();
        break;
    case 2:
        r.Sub();
        break;
    case 3:
        r.Mul();
        break;
    case 4:
        r.Div();
        break;
    case 5:
        r.Mod();
        break;
    }
    }
}
