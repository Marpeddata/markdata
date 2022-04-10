import java.util.InputMismatchException;
import java.util.Scanner;

public class TextUI {



    public TextUI() {

    }
    public void matchDoSomething(String whatEver){
        System.out.println(whatEver);
    }

    public void backToMainMenu(){
        Scanner input = new Scanner(System.in);

        System.out.println("Tast 1");
        System.out.println("1 : Hoved menu");


        boolean correct = true;
        while(correct) {

            try {
                switch (input.nextInt()) {
                    case 1:
                        correct = false;
                        mainMenu();
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Tast 1 for at komme tilbage til hovedmenuen");
                input.nextLine();

            }
        }
    }

    public void mainMenu(){
        Scanner input = new Scanner(System.in);

        System.out.println("Setup - Press 1 or 5");
        System.out.println("1 : Tilføj Resultater");
        System.out.println("2 : Se Hold");
        System.out.println("3 : Se Kampprogram");
        System.out.println("4 : Se Tunerings Resultater");
        System.out.println("5 : Save & Quit");

        boolean correct = true;
        while(correct) {

            try {
                switch (input.nextInt()) {
                    case 1:
                        correct = false;
                        //matchChecker - Checks if a match has data
                        //if(teamOneName = "")
                        //matchSetup()
                        //else if(teamOnescore = -1
                        //matchScore()
                        //"1 : Næste kamp
                        //"2 : Tilbage til hovedmenu"
                        matchDoSomething("Indtast Hold 1 score");
                        backToMainMenu();
                        break;

                    case 2:
                        correct = false;
                        //showTeams
                        matchDoSomething("Wohoo! \n-Mark\n-Mayas\n.");
                        backToMainMenu();
                        break;

                    case 3:
                        correct = false;
                        //showBracket
                        matchDoSomething("Kamp 1 : Hold 1 - Hold 2 \n mål : 10 - 7");
                        backToMainMenu();
                        break;

                    case 4:
                        //showRanking
                        matchDoSomething("hold 1: Mål: Målscore:");
                        backToMainMenu();
                        break;

                    case 5:
                        correct = false;
                        matchDoSomething("Saved - Tak for nu!");
                        //saveTeam
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("indtast et tal mellem 1 og 5");
                input.nextLine();

            }
        }
    }

    public void startMenu() {
            Scanner input = new Scanner(System.in);

            System.out.println("Setup - Press 1 or 2");
            System.out.println("1 : Start ny Turnering");
            System.out.println("2 : Igangværende turnering");

                boolean correct = true;
                while(correct) {

                    try {
                        switch (input.nextInt()) {
                            case 1:
                                correct = false;
                                //createTeam x8
                                //saveTeamData - add all teams to an arraylist, save into file.
                                //matchSetup x4
                                //saveTournamentData - add matches to arraylist, save data into file.
                                mainMenu();
                                break;


                            case 2:
                                correct = false;
                                //loadTeamData
                                //loadTournamentData
                                matchDoSomething("what ever");
                                mainMenu();
                                break;
                        }

                    } catch (InputMismatchException e) {
                        System.out.println("indtast et tal mellem 1 og 2");
                        input.nextLine();

                    }
                }
    }




}
