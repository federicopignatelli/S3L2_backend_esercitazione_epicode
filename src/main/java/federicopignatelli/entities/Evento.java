package federicopignatelli.entities;
import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name="evento")

public class Evento {
    @Id
    @GeneratedValue
    private long id;

    @Column(name="nome")
    private String nomeEvento;

    @Column(name="data")
    private LocalDate dataEvento;

    @Column(name="descrizione")
    private String descrizioneEvento;

    @Column(name="tipo")
    @Enumerated(EnumType.STRING)
    private EventoTipo EventoTipo;

    @Column(name="nmassimopartecipanti")
    private long nMassimoPartecipanti;

    //COSTRUTTORI

    public Evento() {
    }

    public Evento(String nomeEvento, LocalDate dataEvento, String descrizioneEvento, federicopignatelli.entities.EventoTipo eventoTipo, long nMassimoPartecipanti) {
        this.nomeEvento = nomeEvento;
        this.dataEvento = dataEvento;
        this.descrizioneEvento = descrizioneEvento;
        EventoTipo = eventoTipo;
        this.nMassimoPartecipanti = nMassimoPartecipanti;
    }

    //GETTERS & SETTERS

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public void setNomeEvento(String nomeEvento) {
        this.nomeEvento = nomeEvento;
    }

    public LocalDate getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(LocalDate dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getDescrizioneEvento() {
        return descrizioneEvento;
    }

    public void setDescrizioneEvento(String descrizioneEvento) {
        this.descrizioneEvento = descrizioneEvento;
    }

    public federicopignatelli.entities.EventoTipo getEventoTipo() {
        return EventoTipo;
    }

    public void setEventoTipo(federicopignatelli.entities.EventoTipo eventoTipo) {
        EventoTipo = eventoTipo;
    }

    public long getnMassimoPartecipanti() {
        return nMassimoPartecipanti;
    }

    public void setnMassimoPartecipanti(long nMassimoPartecipanti) {
        this.nMassimoPartecipanti = nMassimoPartecipanti;
    }

    //TOSTRING
    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", nomeEvento='" + nomeEvento + '\'' +
                ", dataEvento=" + dataEvento +
                ", descrizioneEvento='" + descrizioneEvento + '\'' +
                ", EventoTipo=" + EventoTipo +
                ", nMassimoPartecipanti=" + nMassimoPartecipanti +
                '}';
    }
}
