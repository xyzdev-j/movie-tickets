public class App {
    public static void main() {
        Movie.add("Braveheart",8.3f, "Action - War", "Monday");
        Movie.add("Forrest Gump", 8.8f, "Drama - Romance", "Saturday");
        Movie.add("12 Angry Men", 9.0f, "Drama - Crime", "Friday");

        Movie.getAllMovies();
    }
}
