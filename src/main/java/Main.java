import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Movie braveHeart = new Movie("Braveheart", 8.3f, "Action, War", "Monday");
        Movie forrestGump = new Movie("Forrest Gump", 8.8f, "Drama, Romance", "Saturday");
        Movie twelveAngryMen = new Movie("12 Angry Men", 9.0f, "Drama, Crime", "Friday");

        Ticket braveHeartTickets = new Ticket("Braveheart", 1000, 120.0f);
        Ticket forrestGumpTickets = new Ticket("Forrest Gump", 1000, 130.5f);
        Ticket twelveAngryMenTickets = new Ticket("12 Angry Men", 1000, 200.0f);

        boolean running = true;
        Scanner scn = new Scanner(System.in);

        while (running)
        {
            System.out.println("Welcome!");
            Movie.listOfMovies();
            System.out.println();
            System.out.println("What do you want to do? :");
            System.out.println();
            System.out.println("1. Buy tickets");
            System.out.println("2. Cancel tickets");
            System.out.println("3. Exit");

            int userChoice = scn.nextInt();
            scn.nextLine();
            switch (userChoice)
            {
                case 1:
                    System.out.println("Write movie name: ");
                    String movieName = scn.nextLine();
//                    scn.nextLine();

                    switch (movieName)
                    {
                        case "Braveheart":
                            System.out.println("Price of a ticket: " + braveHeartTickets.getTicketPrice());
                            System.out.println("Number of tickets to buy: ");
                            int n1 = scn.nextInt();
                            scn.nextLine();
                            braveHeartTickets.buyTicket(n1);
                            break;

                        case "Forrest Gump":
                            System.out.println("Price of a ticket: " + forrestGumpTickets.getTicketPrice());
                            System.out.println("Number of tickets to buy: ");
                            int n2 = scn.nextInt();
                            scn.nextLine();
                            forrestGumpTickets.buyTicket(n2);
                            break;

                        case "12 Angry Men":
                            System.out.println("Price of a ticket: " + twelveAngryMenTickets.getTicketPrice());
                            System.out.println("Number of tickets to buy: ");
                            int n3 = scn.nextInt();
                            scn.nextLine();
                            twelveAngryMenTickets.buyTicket(n3);
                            break;

                        default:
                            System.out.println("Wrong movie name.");
                            System.out.println();

                    }
                    break;

                case 2:
                    break;

                case 3:
                    System.out.println("Goodbye.");
                    running = false;
                    break;

                default:
                    System.out.println("Sorry. Wrong choice.");
            }
        }
    }
}