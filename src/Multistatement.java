public interface Multistatement
{
    String say(String message);
}
class LambdaCode
{
    public static void main(String args[])
    {
        Multistatement ml=(message) ->
        {
            String str1="I would like to say ";
            String str2=str1 + message;
            return str2;
        };
        System.out.println(ml.say("need not to worry,its just a beginning"));
    }
}
