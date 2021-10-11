import java.util.ArrayList;
import java.util.List;
public class ForEach
{
    public static void main(String args[])
    {
        List<String> gamesList=new ArrayList<>();
        gamesList.add("cricket");
        gamesList.add("basketball");
        System.out.println("iterating by method reference");
        gamesList.forEach(System.out::println);
    }
}
