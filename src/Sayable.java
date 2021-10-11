@FunctionalInterface
public interface Sayable
{
    void say(String msg);
}
class FunctionalInterfaceExample implements Sayable
{
    public void say(String msg)
    {
        System.out.print(msg);
    }
    public  static void main(String args[])
    {
        FunctionalInterfaceExample fie=new FunctionalInterfaceExample();
        fie.say("hello");
    }
}
