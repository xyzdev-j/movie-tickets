public class Ticket {
    String movieName;
    int availableTickets;

    public Ticket(String name, int totalTickets)
    {
        this.movieName = name;
        this.availableTickets = totalTickets;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public String getMovieName() {
        return movieName;
    }
}
