import java.util.*;

class Main {
  public static void main(String[] args) {
    Map<Integer, String> topMovies = new HashMap<>();
    Map<Integer, String> employees = new HashMap<>();

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
    employees.put(345, "Deer Park");
    employees.put(234, "Homer Simpson");
    employees.put(445, "Gordon Freeman");
    employees.put(543, "Nikola Tesla");

    /* Section 5 */

    /* Section 6 */
    log(employees.keySet());
    log(employees.values());
    log(employees.entrySet());
  }

  public static void log(Object message) {
    System.out.println(message);
  }
}
