package hello.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Login")
public class Login implements Serializable {

    // columns
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "email", nullable = false, insertable = true, updatable = true, length = 50)
    private String email;

    @Column(name = "password", nullable = false, insertable = true, updatable = true, length = 30)
    private String password;


    // constructor
    Login() {

    }

    Login(Long id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
    }

    // relation
    @OneToOne(fetch = FetchType.EAGER, mappedBy = "login")
    private User user;

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
//LAZY = fetch when needed
//EAGER = fetch immediately


// check one to one
// check one to many
// check connections to db
// make sql dialect