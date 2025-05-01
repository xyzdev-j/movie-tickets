public class Movie {

    String name;
    float rate;
    String genre;
    String date;
    int tickets_available;
    int tickets_sold;

    public Movie(String name,
                 float rate,
                 String genre,
                 String date,
                 int tickets_available,
                 int tickets_sold)
    {
        this.name = name;
        this.rate = rate;
        this.genre = genre;
        this.date = date;
        this.tickets_available = tickets_available;
        this.tickets_sold = tickets_sold;
    }
}
