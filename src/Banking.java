 class Banking
 {
     int getrateOfInterest()
     { return 0;}
}
class BOB extends Banking
{

    int getrateOfInterest() {
        return 8;
    }
}
class  ICIC extends Banking
{
    @Override
    int getrateOfInterest() {
        return 7;
    }
}
class AXIS extends Banking
{
    @Override
    int getrateOfInterest() {
        return 9;
    }

}
class Test2
{
    public static void main(String args[])
    {
        BOB b=new BOB();
        ICIC i=new ICIC();
        AXIS a=new AXIS();
        System.out.println("BOB ROI:" + b.getrateOfInterest());
        System.out.println("ICIC ROI:" + i.getrateOfInterest());
        System.out.println("AXIS ROI:" + a.getrateOfInterest());
    }
}