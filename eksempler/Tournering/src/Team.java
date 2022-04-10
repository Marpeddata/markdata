public class Team {
    private String teamName;
    private int teamGoalDifference = 0;
    private int teamGoalScored = 0;
    private int teamGoalsTaken = 0;
    private int teamPoints = 0;


public Team() {

    teamGoalDifference = teamGoalScored - teamGoalsTaken;

}

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName){
        this.teamName = teamName;
    }

    public int getTeamGoalDifference(){
        return teamGoalDifference;
    }

    public int getTeamGoalScored(){
        return teamGoalScored;
    }

    public void setTeamGoalScored(int teamGoalScored){
        this.teamGoalScored = teamGoalScored;
    }

    public int getTeamGoalsTaken(){
        return teamGoalsTaken;
    }

    public void setTeamGoalsTaken(int teamGoalsTaken){
        this.teamGoalsTaken = teamGoalsTaken;
    }

    public int getTeamPoints(){
        return teamPoints;
    }

    public void setTeamPoints(int teamPoints){
        this.teamPoints = teamPoints;
    }


}


