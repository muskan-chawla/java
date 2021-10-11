public interface Summable
{
    int sum(int a,int b);
}
class Lambda3
{
    public static void main(String args[])
    {
        Summable s1=(a,b) -> (a+b);
        System.out.println((s1.sum(10000,20000)));

        Summable s2=(a,b) -> (a+b);
        System.out.println(s2.sum(100,200));
    }
}

