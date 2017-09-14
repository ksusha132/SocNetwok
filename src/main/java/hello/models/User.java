package hello.models;

import java.util.Date;
import java.util.Set;
import javax.persistence.*;


@Entity
@Table(name = "User")
public class User {

    //columns
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idUser")
    private Long idUser;

    @Column(name = "name", nullable = true, insertable = true, updatable = true, length = 50)
    private String name;

    @Column(name = "secondName", nullable = true, insertable = true, updatable = true, length = 50)
    private String secondName;

    @Column(name = "birthDate", nullable = true, insertable = true, updatable = true)
    private Date birthDate;

    @Column(name = "photo", nullable = true, insertable = true, updatable = true, length = 255)
    private String photo;

    @Column(name = "gender", nullable = true, insertable = true, updatable = true, length = 5)
    private String gender;


    // constructor
    User() {

    }

    User(Long idUser, String name, String secondName, Date birthDate) {
        this.idUser = idUser;
        this.name = name;
        this.secondName = secondName;
        this.birthDate = birthDate;
    }

    public User(String name, String secondName, Date birthDate, String photo, String gender, Login login) {
        this.name = name;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.photo = photo;
        this.gender = gender;
        this.login = login;
    }

    //relations
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "login_id")
    private Login login;


    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private Set<UserRoles> userRoles;


    //getters ans setters


    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


    //comparators

    // age
    //multiple comparator
}

