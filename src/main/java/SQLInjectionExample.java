import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import javax.persistence.*;

// This is a sample Java file with a SQL injection vulnerability for testing purposes.
public class SQLInjectionExample {
    @Entity
    @Table(name = "users")

    // User entity representing a user in the system.
    public static class User {

        @Id
        @GeneratedValue
        private Integer id;

        @Column(nullable = false, unique = true)
        private String login;
    }

    // Added comments and formatting changes to move lines
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String login = args[0];
        Query query = entityManager.createQuery("SELECT u FROM User u WHERE u.login = '" + login + "'");
        List<User> resultList = query.getResultList();
        System.out.println(resultList);

        entityManager.close();
        entityManagerFactory.close();
    }
    
    public static void test2(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        String login = args[0];
        Query humanQuery = entityManager.createQuery("SELECT u FROM Admin u WHERE u.login = '" + login + "'");
        List<User> resultList = humanQuery.getResultList();
        System.out.println(resultList);

        entityManager.close();
        entityManagerFactory.close();
    }

    public static void test3(String[] args) {
        String s = new Random()
            .ints(5, 1, 10)
            .mapToObj(i -> i + "_")
            .collect(Collectors.joining());
        System.out.println(s);
    }
}
