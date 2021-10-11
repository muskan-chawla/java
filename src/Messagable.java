public interface Messagable
{
    Message getMessage(String msg);
}
class Message
{
      Message(String msg)
    {
        System .out.println(msg);
    }

}
class ConstructorReference
{
    public static void main(String args[])
    {
        Messagable  hello = Message::new;
        hello.getMessage("hello");
    }
}
