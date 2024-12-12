interface out{
    void outm();
    interface in{
        void inm();
    }
}
public class Nested_Interface1 implements out.in
{
        public void inm()
        {
            System.out.println("Hello i am here");
        }
        public static void main(String[] args)
        {
            Nested_Interface1 n=new Nested_Interface1();
            n.inm();
            
        }
    
}
