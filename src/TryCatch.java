public class TryCatch
{
    public static void main(String args[])
    {
        try{
            System.out.println("inside try block");
            int data=50/0;
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
    }
        System.out.println("rest of the code");
    }
}
