import java.util.List;
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

    public static void function(String[] args) {
        // This function is added to create more lines in the file and move the vulnerable code down, testing originalLine mapping in AI Blame.
        System.out.println("This is a new function to increase line count and move vulnerable code.");
    }
}
