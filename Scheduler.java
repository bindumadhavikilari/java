import java.util.ArrayList;
import java.util.List;

public class schedular {
    public static List<Match> createSchedule(List<Team> teams) {
        List<match> matches = new ArrayList<>();
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.sizee(); j++) {
                Match match = new Match(teams.get(i), teams.get(j));
                matches.add(match);
            }
        }
        return matches;
    }
}
