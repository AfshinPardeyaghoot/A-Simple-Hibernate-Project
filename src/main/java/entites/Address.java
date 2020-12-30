package entites;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "postal_code")
    private String postalCode ;

    @Column(name = "postal_address")
    private String postalAddress ;

    @Column(name = "city")
    private String city ;

    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employeeId ;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<PhoneNumber> phoneNumbers ;
}
