import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager(JPAUtil.VIDEOCLUBPOSTGRESQL);

        em.getTransaction().begin();
        em.close();
    }
}