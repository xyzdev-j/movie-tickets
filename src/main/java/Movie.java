import java.util.ArrayList;

public class Movie {

    String name;
    float rate;
    String genre;
    String date;
    static ArrayList<String> movies = new ArrayList<String>(3);

    public Movie(String name,
                 float rate,
                 String genre,
                 String date)
    {
        this.name = name;
        this.rate = rate;
        this.genre = genre;
        this.date = date;
        movies.add(name);
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

    public static void listOfMovies()
    {
        System.out.println("List of movies available: ");
        for(String s : movies)
        {
            System.out.println(s);
        }
    }
}
