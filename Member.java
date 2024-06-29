import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @Enumerated(EnumType.STRING)
    private MemberStatus status;
    private Date renewalDate;

    // Constructors, getters, and setters
    public Member() {}

    // other constructors, getters and setters
}

enum MemberStatus {
    ACTIVE, LAPSED
}