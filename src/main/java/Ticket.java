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

    public String buyTicket(String name, int number)
    {

    }
}
