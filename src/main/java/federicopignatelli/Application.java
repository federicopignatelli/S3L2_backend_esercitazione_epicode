package federicopignatelli;

import federicopignatelli.entities.Evento;
import federicopignatelli.entities.EventoTipo;
import federicopignatelli.dao.EventoDAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneeventi");

    public static void main(String[] args) {


        EntityManager em = emf.createEntityManager();
        EventoDAO sd = new EventoDAO(em);
        Evento Cerimonia = new Evento("Cerimonia", LocalDate.of(2020, 1,1), "un bel matrimonio", EventoTipo.CAPODANNO, 100);
        Evento Capodanno = new Evento("Capodanno", LocalDate.of(2023, 3,12), "un bel capodanno", EventoTipo.CAPODANNO, 150);
        sd.save(Capodanno);

       em.close();
       emf.close();
    }
}
