public interface Drawable {
    public void draw();
}
    class LambdaExpressionExample1
{
    public static void main(String args[])
    {
        int width=10;
        Drawable da=()->System.out.println("Drwaing"+ width);
        da.draw();



    }

}
