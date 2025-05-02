public class Ticket {
    String movieName;
    int availableTickets;
    float ticketPrice;

    public Ticket(String name, int totalTickets, float price)
    {
        this.movieName = name;
        this.availableTickets = totalTickets;
        this.ticketPrice = price;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public String getMovieName() {
        return movieName;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public boolean buyTicket(int number)
    {
        if (number <= availableTickets)
        {
            availableTickets -= number;
            System.out.println("Bought " + number + " tickets for " + movieName + ".");
            System.out.println();
            return true;
        }
        else {
            System.out.println("Not enough tickets available.");
            System.out.println();
            return false;
        }
    }
}
