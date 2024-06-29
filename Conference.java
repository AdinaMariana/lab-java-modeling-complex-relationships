import javax.persistence.*;
import java.util.List;

@Entity
public class Conference extends Event {

    @OneToMany(mappedBy = "conference", cascade = CascadeType.ALL)
    private List<Speaker> speakers;

    // constructors, getters, setters
}
