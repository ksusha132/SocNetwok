package hello.models;


import javax.persistence.*;

@Entity
@Table(name = "UserRoles")
public class UserRoles {

    // constructors
    public UserRoles() {
    }

    public UserRoles(Long idUR, User user, Roles roles) {
        this.idUR = idUR;
        this.user = user;
        this.roles = roles;
    }

    // columns

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUR")
    private Long idUR;

    //connections

    @ManyToOne()
    @JoinColumn(name = "idUser")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "idRole")
    private Roles roles;

    // getters ans setters

    public Long getIdUR() {
        return idUR;
    }

    public void setIdUR(Long idUR) {
        this.idUR = idUR;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }
}
