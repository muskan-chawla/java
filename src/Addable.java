public interface Addable
{
    int add(int a,int b);
}
class LambdaExample4
{
    public static void main(String args[])
    {
        Addable ad=(a,b) -> (a+b);
        System.out.println(ad.add(20,30));

        Addable ad1=(int a,int b) ->
        {
            return (a+b);
        };
        System.out.println(ad1.add(30,40));
    }
}
