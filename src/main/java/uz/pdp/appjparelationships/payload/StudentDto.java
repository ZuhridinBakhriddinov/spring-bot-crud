package uz.pdp.appjparelationships.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uz.pdp.appjparelationships.entity.Subject;

import javax.persistence.Column;
import java.util.List;

// Zuhridin Bakhriddinov 3/5/2022 7:58 PM
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDto {
    /*
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @OneToOne//ONE student TO ONE address*** ONE address TO ONE student
    private Address address;

    @ManyToOne
    private Group group;

    @ManyToMany
    private List<Subject> subjects;*/
    private String firstName;
    private String lastName;
    private Integer addressId;
    private Integer groupId;
    private List<Integer> subjectsId;

}
