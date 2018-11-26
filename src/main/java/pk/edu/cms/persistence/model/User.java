package pk.edu.cms.persistence.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADMIN on 11/17/2018.
 */

@Data
@Entity
@EqualsAndHashCode
@ToString
public class User {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long userId;

    private String userEmail;
    private String userPassword;

    @ManyToMany(fetch = FetchType.EAGER, cascade = {
            CascadeType.MERGE
    })
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "userId"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "roleId")
    )
    private List<Role> roles = new ArrayList<>();


    public User() {}

    public User(String username, String passwordHash, List<Role> roles) {
        super();
        this.userEmail = username;
        this.userPassword = passwordHash;
        this.roles = roles;
    }

}
