package hello.models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "Roles")
public class Roles {

    public Roles() {

    }

    public Roles(Long idRole, String nameRole) {
        this.idRole = idRole;
        this.nameRole = nameRole;
    }

    // Columns
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idRole")
    private Long idRole;

    @Column(name = "nameRole", nullable = false, insertable = true, updatable = true, length = 10)
    private String nameRole;

    // relations
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "roles")
    private Set<UserRoles> userRoles;

    // getters and setters

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getNameRole() {
        return nameRole;
    }

    public void setNameRole(String nameRole) {
        this.nameRole = nameRole;
    }


}
