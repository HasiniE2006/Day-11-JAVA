abstract interface math
{
    void print();
}
class d implements math
{
    public void print()
    {
        System.out.println("Hello");
    }
}
public class Abstract_Interface {
    public static void main(String[] args) {
        d f=new d();
        f.print();
    }
    
}
