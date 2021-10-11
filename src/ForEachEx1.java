import java.util.ArrayList;
import java.util.List;

public class ForEachEx1
{
    public static void main(String args[])
    {
        List<String> gamesList=new ArrayList<String>();
        gamesList.add("football");
        gamesList.add("hockey");

        System.out.println("iterating by lambda expression");
        gamesList.forEach(games->System.out.println(games));
    }
}
