public class Movie {

    String name;
    float rate;
    String genre;
    String date;
    int ticketsAvailable;

    public Movie(String name,
                 float rate,
                 String genre,
                 String date,
                 int totalTickets)
    {
        this.name = name;
        this.rate = rate;
        this.genre = genre;
        this.date = date;
        this.ticketsAvailable = totalTickets;
    }

    public String getName() {
        return name;
    }

    public float getRate() {
        return rate;
    }

    public String getGenre() {
        return genre;
    }

    public String getDate() {
        return date;
    }

    public int getTicketsAvailable() {
        return ticketsAvailable;
    }
}
