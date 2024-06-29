import javax.persistence.*;
import java.util.List;

@Entity
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String district;

    @OneToOne
    @JoinColumn(name = "president_id", referencedColumnName = "id")
    private Member president;

    @OneToMany
    @JoinColumn(name = "chapter_id") // Assuming a column in the Member table to link back to the Chapter
    private List<Member> members;

    // Constructors, getters, and setters
    public Chapter() {}

    // other constructors, getters and setters
}
