public interface Speakable
{
    void speakSomething();
}
 class InstanceMethodReference
{
    public void speakSomething()
    {
        System.out.println("hello,static method here");
    }
    public static void main(String args[])
    {
        InstanceMethodReference methodReference=new InstanceMethodReference();

        Speakable s1 = methodReference::speakSomething;
        s1.speakSomething();
    }
}
