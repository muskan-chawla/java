class Sum {
    static int add(int a,int b)
    { return a+b;}
    static double add(double a,double b)
    { return a+b;}

}
class Overload2
{
    public static void main(String args[])
    {
        System.out.println(Sum.add(10,10));
        System.out.println(Sum.add(10.2,10.2));
    }
}
