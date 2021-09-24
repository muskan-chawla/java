import java.util.HashMap;
import java.util.Map;

public class MapExample
{
    public static void main(String args[])
    {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"apple");
        map.put(2,"mango");
        map.put(3,"grapes");

        System.out.println("iterating values");
        for(Map.Entry m: map.entrySet())
        {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
