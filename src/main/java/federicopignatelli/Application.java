package federicopignatelli;

import entities.Evento;
import entities.EventoTipo;
import dao.EventoDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {


        EntityManager em = emf.createEntityManager();
        EventoDAO sd = new EventoDAO(em);
        Evento Cerimonia = new Evento(1, "Cerimonia", LocalDate.of(2020, 1,1), "un bel matrimonio", EventoTipo.CAPODANNO, 100);

        sd.save(Cerimonia);

       em.close();
       emf.close();
    }
}
