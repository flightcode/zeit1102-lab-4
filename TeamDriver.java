import java.util.*;

public class TeamDriver {
    Cyclist c1;
    Cyclist c2;
    Scanner scan = new Scanner(System.in);

    public void readCyclist1() {
        System.out.print("Enter the first cyclist name : ");
        String name = scan.nextLine();
        System.out.print("Enter the first cyclist team : ");
        String team = scan.nextLine();
        c1 = new Cyclist(name, team);
    }

    public void readCyclist2() {
        System.out.print("Enter the second cyclist name : ");
        String name = scan.nextLine();
        System.out.print("Enter the second cyclist team : ");
        String team = scan.nextLine();
        c2 = new Cyclist(name, team);
    }

    public void doMainLoop() {
        int answer;
        do {
            // printing cyclist information and options
            System.out.println("\n");
            System.out.println(c1);
            System.out.print("Do you want to\n" + "1) add a result " + "\n2) quit : ");
            answer = scan.nextInt();

            if (answer == 1) { // get result

                boolean win1 = false;
                System.out.print("What was " + c1.getName() + "\'s time? ");
                double time1 = scan.nextDouble();
                scan.nextLine();

                System.out.print("Did they win (Y/N) : "); // check for winner
                String wins = scan.nextLine();
                switch (wins.charAt(0)) {
                    case 'y':
                    case 'Y':
                        win1 = true;
                        break;
                    case 'n':
                    case 'N':
                        break;

                    default:
                        System.out.println("That's not valid\n");
                }

                c1.recordStage(time1, win1); // record results
            }
        } while (answer != 2);
    }

    public void init() {
        readCyclist1();
        readCyclist2();
        doMainLoop();
    }

    public static void main(String[] args) {
        TeamDriver td = new TeamDriver();
        td.init();
        if (td.c2.getStageWins() > td.c1.getStageWins()) {
            System.out.println("WINNER! " + td.c2.toString());
        } else if (td.c1.getStageWins() > td.c2.getStageWins()) {
            System.out.println("WINNER! " + td.c1.toString());
        } else {
            System.out.println("That was a boring race...");
        }
    }
}