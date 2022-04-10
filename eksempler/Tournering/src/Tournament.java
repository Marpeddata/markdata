import java.util.ArrayList;
import java.util.Scanner;

public class Tournament {
    TextUI myUI = new TextUI();

    private ArrayList<Team> fullListOfTeams = new ArrayList<>();
    private ArrayList<Match> matchList = new ArrayList<>();
    private ArrayList<Team> availableTeams = new ArrayList<>();

    public void startTournament(){
        Team one = new Team();
        Team two = new Team();

        availableTeams.add(one);
        availableTeams.add(two);

        createMatch(availableTeams);
        System.out.println(availableTeams.size());


        myUI.startMenu();



    }

    //checks for the last match in the array without either team1 name or team1 score, then creates matches. Might not be usefull.
    public void matchChecker(ArrayList<Match> matchList){


        for(int i = 0; i < matchList.size(); i++) {
            if (matchList.get(i).getTeamOneName() == "") {
                createMatch(availableTeams);

            } else if (matchList.get(i).getTeamOneName() == "" && matchList.get(i).getTeamOneScore() == -1) {
                createMatch(availableTeams);
                matchList.get(i).matchScore();
            }
        }
    }

    //create a match from input and add the match to the matchList array
    public void createMatch(ArrayList<Team> availableTeams) {
        Scanner input = new Scanner(System.in);
        Team team1 = new Team();
        Team team2 = new Team();

        System.out.println("Hold 1 <- Hold 2");
        System.out.println("Vælg Hold 1");

        for (int i = 1; i < availableTeams.size()+1; i++) {
            System.out.println(i + " : " + team1.getTeamName() + " | Points : " + team1.getTeamPoints() + " | Måldif : " + team1.getTeamGoalDifference());
        }



        for (int i = 1; i < availableTeams.size(); i++) {
            int pick = input.nextInt();

            if (pick <= availableTeams.size() && pick >= 1) {


                team1 = availableTeams.get(i);
                availableTeams.remove(i);



            } else {
                System.out.println("prøv igen");
                input.nextInt();
            }
        }

        System.out.println("Hold 1 -> Hold 2");
        System.out.println("Vælg Hold 2");

        for (int i = 0; i < availableTeams.size(); i++) {
            System.out.println(i+1 + " : " + team2.getTeamName() + " | Points : " + team2.getTeamPoints() + " | Måldif : " + team2.getTeamGoalDifference());
        }

        for (int i = 0; i < availableTeams.size(); i++) {
            int pick = input.nextInt();
            if (pick - 1 <= availableTeams.size() && pick >= 1) {
                team2 = availableTeams.get(i);
                availableTeams.remove(i);

            } else {
                System.out.println("prøv igen");
                input.nextInt();
            }
        }
        Match m = new Match(team1, team2);
        matchList.add(m);



    }



}
