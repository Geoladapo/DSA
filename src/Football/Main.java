package Football;

interface Player {
    String name();
}

record BaseBallPlayer(String name, String position) implements Player {}
record FootballPlayer(String name, String position) implements Player {}
record VolleyBallPlayer(String name, String position) implements Player {}

public class Main {
    public static void main(String[] args) {

        var philly = new Affiliation("city", "Philadelphia, PA", "US");

        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1,3, astros1, 5);


        SportTeam phillies2 = new SportTeam("Philadelphia Phillies");
        SportTeam astros2 = new SportTeam("Houston Astros");
        scoreResult(phillies2,3, astros2, 5);

        Team<BaseBallPlayer, Affiliation> phillies = new Team<>("Philadelphia Phillies", philly);
        Team<BaseBallPlayer, Affiliation> astros = new Team<>("Houston Astros");
        scoreResult(phillies,3, astros, 5);

        var harper = new BaseBallPlayer("B Harper", "Right Fielder");
        var marsh = new BaseBallPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();

        SportTeam afc1 = new SportTeam("Adelaide Crows");
        Team<FootballPlayer, Affiliation> afc = new Team<>("Adelaide Crows");
        var tex = new FootballPlayer("Tex Walker", "Centre half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Midfielder");
        afc.addTeamMember(rory);
        afc.listTeamMembers();


        Team<VolleyBallPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyBallPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();
    }

    public  static void scoreResult(BaseballTeam team1, int t1_score,
                                    BaseballTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public  static void scoreResult(SportTeam team1, int t1_score,
                                    SportTeam team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public  static void scoreResult(Team team1, int t1_score,
                                    Team team2, int t2_score) {
        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
