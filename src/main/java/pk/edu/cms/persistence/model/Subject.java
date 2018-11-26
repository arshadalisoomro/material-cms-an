package pk.edu.cms.persistence.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMIN on 11/26/2018.
 */
@Data
@Entity
@EqualsAndHashCode
@ToString
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long subjectId;

    private String subjectMenuName;

    private int subjectPosition;

    private boolean subjectVisibility;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "subject_id")
    private List<Page> pages = new ArrayList<>();
}
