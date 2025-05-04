import java.util.ArrayList;
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
        for (Integer i: movies.keySet()) {
            System.out.println(movies.get(i));
        }
    }
}