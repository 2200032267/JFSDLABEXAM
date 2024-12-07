package KLEF.Hibernate_CRUD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        // Hibernate setup
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        // Inserting records
        Project p1 = new Project("Project Alpha", 6, 50000, "Alice");
        Project p2 = new Project("Project Beta", 12, 80000, "Bob");

        session.save(p1);
        session.save(p2);

        // Aggregate Queries using JPQL
        // Count
        Long totalProjects = (Long) session.createQuery("SELECT COUNT(p) FROM Project p").getSingleResult();
        System.out.println("Total Projects: " + totalProjects);

        // Max Budget
        Integer maxBudget = (Integer) session.createQuery("SELECT MAX(p.budget) FROM Project p").getSingleResult();
        System.out.println("Maximum Budget: " + maxBudget);

        // Min Budget
        Integer minBudget = (Integer) session.createQuery("SELECT MIN(p.budget) FROM Project p").getSingleResult();
        System.out.println("Minimum Budget: " + minBudget);

        // Sum Budget
        Long sumBudget = (Long) session.createQuery("SELECT SUM(p.budget) FROM Project p").getSingleResult();
        System.out.println("Sum of Budgets: " + sumBudget);

        // Average Budget
        Double avgBudget = (Double) session.createQuery("SELECT AVG(p.budget) FROM Project p").getSingleResult();
        System.out.println("Average Budget: " + avgBudget);

        // Commit the transaction
        tx.commit();
        session.close();
        sf.close();
    }
}
