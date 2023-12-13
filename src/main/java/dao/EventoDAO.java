package dao;

import entities.Evento;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
public class EventoDAO {
    private final EntityManager em;
    public EventoDAO(EntityManager em) {
        this.em = em;
    }

    public void save(Evento evento) {
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        em.persist(evento);
        transaction.commit();
        System.out.println("Studente " + evento.getNomeEvento() + " aggiunto correttamente!");
    }


}
