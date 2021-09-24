public class TestFinallyBlock
{
    public static void main(String args[])
    {
        try
        {
            System.out.println("Inside try block");
            int arr[]={1,2,3,4};
            System.out.println(arr[10]);
        }
        catch(NullPointerException e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code");

    }
}
