public interface Sayable1
{
    public String say(String name);
}
class LambdaExpressionExample2
{
    public static void main(String args[])
    {
        Sayable1 s1=(name) ->
        {
            return "Hello, "+name;
        };
        System.out.println(s1.say("sonoo"));

        Sayable1 s2=(name) ->
        {
            return  "hello," +  name;
        };
        System.out.println(s2.say("sonoo"));

    }
}