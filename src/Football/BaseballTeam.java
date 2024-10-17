package Football;

import java.util.ArrayList;
import java.util.List;

public class BaseballTeam {
    private final String teamName;
    private final List<BaseBallPlayer> teamMembers = new ArrayList<>();
    private int totalWins = 0;
    private int totalLosses = 0;
    private int totalDraws = 0;

    public BaseballTeam(String teamName) {
        this.teamName = teamName;
    }

    public void addTeamMember(BaseBallPlayer teamMember) {
        if (!teamMembers.contains(teamMember)) {
            teamMembers.add(teamMember);
        }
    }

    public void listTeamMembers() {
        System.out.println(teamName + " Roster");
        System.out.println(teamMembers);
    }

    public int ranking() {
        return (totalLosses * 2) + totalDraws + 1;
    }

    public String setScore(int ourScore, int theirScore) {
        String message = "lost to";
        if (ourScore > theirScore) {
            totalWins++;
            message = "beat";
        } else if (ourScore == theirScore) {
            totalDraws++;
            message = "draw";
        } else {
            totalLosses++;
        }
        return message;
    }

    @Override
    public String toString() {
        return
                teamName + " (Ranked " + ranking() + ")";
    }
}