public interface Doable
{
    default void dolt()
    {
        System.out.print("do it now");
    }
}
@FunctionalInterface
interface Payable extends Doable
{
    void pay(String msg);

}
 class FuctionalInterfaceExample2 implements Payable
{
    public  void pay(String msg)
    {
        System.out.println("Pay amount");
    }
    public static void main(String args[])
    {
        FuctionalInterfaceExample2 fie=new FuctionalInterfaceExample2();
        fie.pay("pay amount");
        fie.dolt();
    }
}
