import java.util.HashMap;
import java.util.Map;

public class Movie {

    private static int lastUsedID = 320004;
    static Map<Integer, String> movies = new HashMap<>();

    public static void add(String name, float rate, String genre, String date) {

        movies.put(generateNewID(),
                name +
                ", " +
                rate +
                ", " +
                genre +
                ", " +
                date);
    }

    private static int generateNewID() {
        lastUsedID += 1;
        return lastUsedID;
    }

    public static void getAllMovies() {
        System.out.println("List of movies: Name, Rate, Genre, Play");
        for (Integer i: movies.keySet()) {
            System.out.println(movies.get(i));
        }
    }
}