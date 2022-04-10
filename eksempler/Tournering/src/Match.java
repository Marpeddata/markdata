import java.util.ArrayList;
import java.util.Scanner;

public class Match {
    private String teamOneName;
    private String teamTwoName;
    private String matchDateTime;
    private int teamOneScore;
    private int teamTwoScore;


    public Match(Team team1, Team team2){
    teamOneName = team1.getTeamName();
    teamTwoName = team2.getTeamName();
    team1.setTeamGoalScored(teamOneScore);
    team2.setTeamGoalsTaken(teamOneScore);
    team1.setTeamGoalsTaken(teamTwoScore);
    team2.setTeamGoalScored(teamTwoScore);
    }

    public String getTeamOneName(){
        return teamOneName;
    }

    public String getTeamTwoName(){
        return teamTwoName;
    }

    public int getTeamOneScore(){
        return teamOneScore;
    }

    public void setTeamOneScore(int teamOneScore){
        this.teamOneScore = teamOneScore;
    }

    public int getTeamTwoScore(){
        return teamTwoScore;
    }

    public void setTeamTwoScore(int teamTwoScore){
        this.teamTwoScore = teamTwoScore;
    }

    public String getMatchDateTime(){
        return matchDateTime;
    }

    public void setMatchDateTime(String matchDateTime){
        this.matchDateTime = matchDateTime;
    }





    public void matchScore() {
        Scanner input = new Scanner(System.in);
        System.out.println(teamOneName + " <- " + teamTwoName);
        System.out.println("Skriv antal af mål scoret af første hold : " + teamOneName);
        setTeamOneScore(input.nextInt());
        System.out.println(teamOneName + " -> " + teamTwoName);
        System.out.println("Skriv antal af mål scoret af andet hold :  " + teamTwoName);
        setTeamTwoScore(input.nextInt());
    }



}
