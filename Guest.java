import javax.persistence.*;

@Entity
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private ResponseStatus status;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    // constructors, getters, setters
}

enum Response. Status {
    ATTENDING, NOT_ATTENDING, NO_RESPONSE
}