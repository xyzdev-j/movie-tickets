public class Movie {

    String name;
    float rate;
    String genre;
    String date;

    public Movie(String name,
                 float rate,
                 String genre,
                 String date)
    {
        this.name = name;
        this.rate = rate;
        this.genre = genre;
        this.date = date;
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
}
