import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "event_type", discriminatorType = DiscriminatorType.STRING)
public abstract class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    protected Date date;
    protected int duration;
    protected String location;
    protected String title;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL)
    private List<Guest> guests;

    // constructors, getters, setters
}
