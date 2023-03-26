public class simulator {
    public static void playMatches(List<match> matches) {
        for (Match match : matches) {
            int random = (int) ((match.random() * 10) + 1);
            if (random % 2 == 0) {
                match.setWinner(match.getTeam1());
                match.setLoser(match.getTeam2());
            } else {
                match.setWinner(match.getTeam2());
                match.setLoser(match.getTeam1());
            }
        }
    }

    static void showpointsTable(List<Team> teams, List<match> matches) {
        for (Team team : team) {
            int wonGames = matches.stream().filter(m -> m.getWinner().equals(teams)).collect(collectors.toList())
                    .size();
            int lostGames = matches.stream().filter(m -> m.getloser().equals(teams)).collect(collectors.toList())
                    .size();
            System.out.println(team);
            System.out.println(String.valueOf(wonGames));
            System.out.println(String.valueOf(lostGames));
        }
    }
}
