public class Main {
    public static void main(String[] args)
    {
        //Just a start point for now.
        Movie braveHeart = new Movie("Braveheart", 8.3f, "Action, War", "Monday");
        Movie forrestGump = new Movie("Forrest Gump", 8.8f, "Drama, Romance", "Saturday");
        Movie twelveAngryMen = new Movie("12 Angry Men", 9.0f, "Drama, Crime", "Friday");

        Ticket braveHeartTickets = new Ticket("Braveheart", 1000);
        Ticket forrestGumpTickets = new Ticket("Forrest Gump", 1000);
        Ticket twelveAngryMenTickets = new Ticket("12 Angry Men", 1000);
    }
}