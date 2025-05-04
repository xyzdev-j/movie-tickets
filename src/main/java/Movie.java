import java.util.ArrayList;

public class Movie {

    private static int lastUsedID = 320004;
    static ArrayList<String> movies = new ArrayList<>();

    public static void add(String name, float rate, String genre, String date) {
        lastUsedID += 1;
        movies.add(name +
                ", " +
                rate +
                ", " +
                genre +
                ", " +
                date +
                ", " +
                lastUsedID);
    }

    public static void getAllMovies() {
        for (String s: movies) {
            System.out.println(s);
        }
    }
}