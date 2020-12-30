package entites;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;

    @Column(name = "name")
    private String name ;

    @Column(name = "emp_code",nullable = false,unique = true)
    private String empCode ;

    @Column(name = "salary")
    private Double salary ;

    @OneToMany(mappedBy = "employeeId",cascade = CascadeType.ALL)
    private Set<Address> addresses ;
}
