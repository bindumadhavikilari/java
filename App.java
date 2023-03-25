import java .util.ArrayList;
import java.util.List;
public class App
{
    public static void main(String a[]) throws Exception
    {
        list <team> teams =new ArrayList<>();
        teams.add(new team ("india"));
        teams.add(new team ("pakistan"));
        teams.add(new team ("bangladesh"));
        teams.add(new team ("australia"));
        teams.add(new team ("south africa"));
        list <match> matches=Scheduler.createschedule(teams);
        System.out.println(matches);
        simulator.showpointsTable(teams,matches);

    }
}