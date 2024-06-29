import javax.persistence.*;

@Entity
public class Speaker {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;

    // constructors, getters, setters
}