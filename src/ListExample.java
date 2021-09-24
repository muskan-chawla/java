import java.util.ArrayList;
import java.util.Iterator;

class ListExample
{
    public  static void  main(String args[])
    {
        ArrayList<String> list=new ArrayList<>();
        list.add("apple");
        list.add("mango");
        list.add("grapes");

        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
