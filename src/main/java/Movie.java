import java.util.HashMap;
import java.util.Map;

public class Movie {

    private static int lastUsedID = 320004;
    static Map<Integer, String> movies = new HashMap<>();

    public static void add(String name, float rate, String genre, String date) {
        lastUsedID += 1;
        movies.put(lastUsedID,
                name +
                ", " +
                rate +
                ", " +
                genre +
                ", " +
                date);
    }

    public static void getAllMovies() {
        System.out.println("List of movies: Name, Rate, Genre, Play");
        for (Integer i: movies.keySet()) {
            System.out.println(movies.get(i));
        }
    }
}