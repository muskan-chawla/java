public interface Phone
{
    void call();
    default void  message()
    {
       System.out.println("send");
    }
    static void delete()
    {
        System.out.println("deleting");
    }

}
class AndroidPhone implements Phone
{
    public void call()
    {
        System.out.println("calling");
    }
}
class DemoInterface
{
    public static void main(String args[])
    {
        Phone p=new AndroidPhone();
        p.call();
        p.message();
        Phone.delete();


    }
}
