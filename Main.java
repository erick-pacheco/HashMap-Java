import java.util.*;

class Main {
  public static void main(String[] args) {
    Map<Integer, String> topMovies = new HashMap<>();
    Map<String, Integer> employees = new HashMap<>();

    topMovies.put(1, "The Shawshank Redemption");
    topMovies.put(2, "The Godfather");
    topMovies.put(3, "The Dark Knight");
    topMovies.put(4, "The Godfather: Part II");
    topMovies.put(5, "12 Angry Men");

    log(topMovies.get(3));

    /* Section 2 */
    log(topMovies.keySet());
    log(topMovies.values());
    log(topMovies.entrySet());

    /* Section 3 */
    employees.put("Deer Park", 345);
    employees.put("Homer Simpson", 234);
    employees.put("Gordon Freeman", 445);
    employees.put("Nikola Tesla", 543);

    /* Section 5 */
    log(employees.get("Gordon Freeman"));

    /* Section 6 */
    log(employees.keySet());
    log(employees.values());
    log(employees.entrySet());
  }

  public static void log(Object message) {
    System.out.println(message);
  }
}
