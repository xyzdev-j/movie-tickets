public class Movie {

    private static int lastUsedID = 320004;

    private final int movieID;
    private String movieName;
    private float movieRate;
    private String movieGenre;
    private String movieDate;

    public Movie(String name, float rate, String genre, String date) {
        lastUsedID += 1;
        this.movieID = lastUsedID;
        this.movieName = name;
        this.movieRate = rate;
        this.movieGenre = genre;
        this.movieDate = date;
    }

    public int getMovieID() {
        return movieID;
    }

    public String getMovieName() {
        return movieName;
    }

    public float getMovieRate() {
        return movieRate;
    }

    public String getMovieGenre() {
        return movieGenre;
    }

    public String getMovieDate() {
        return movieDate;
    }
}