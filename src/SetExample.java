import java.util.HashSet;
import java.util.Iterator;

class SetExample
{
    public static  void  main(String args[])
    {
        HashSet<String> set=new HashSet<>();
        set.add("apple");
        set.add("mango");
        set.add("grapes");

        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
