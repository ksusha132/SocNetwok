package hello.models;

import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name = "User")
public class User {

    //columns
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

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

    @Column(name = "height", nullable = true, insertable = true, updatable = true, length = 3)
    private Integer height;

    @Column(name = "weight", nullable = true, insertable = true, updatable = true, length = 3)
    private Integer weight;

    @Column(name = "smoking", nullable = true, insertable = true, updatable = true, length = 1)
    private Boolean smoking;

    @Column(name = "drinking", nullable = true, insertable = true, updatable = true, length = 20)
    private String drinking;

    @Column(name = "aboutMe", nullable = true, insertable = true, updatable = true, length = 255)
    private String aboutMe;

    @Column(name = "lookingFor", nullable = true, insertable = true, updatable = true, length = 225)
    private String lookingFor;

    @Column(name = "children", nullable = true, insertable = true, updatable = true, length = 1)
    private Boolean children;

    @Column(name = "wasMarried", nullable = true, insertable = true, updatable = true, length = 1)
    private Boolean wasMarried;

    // constructor
    User() {

    }

    User(Long id, String name, String secondName, Date birthDate) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.birthDate = birthDate;
    }

    public User(String name, String secondName, Date birthDate, String photo, String gender, Integer height, Integer weight,
                Boolean smoking, String drinking, String aboutMe, String lookingFor, Boolean children, Boolean wasMarried,
                Login login) {
        this.name = name;
        this.secondName = secondName;
        this.birthDate = birthDate;
        this.photo = photo;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.smoking = smoking;
        this.drinking = drinking;
        this.aboutMe = aboutMe;
        this.lookingFor = lookingFor;
        this.children = children;
        this.wasMarried = wasMarried;
        this.login = login;
    }

    //relations
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "login_id")
    private Login login;

    //getters ans setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Boolean getSmoking() {
        return smoking;
    }

    public void setSmoking(Boolean smoking) {
        this.smoking = smoking;
    }

    public String getDrinking() {
        return drinking;
    }

    public void setDrinking(String drinking) {
        this.drinking = drinking;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getLookingFor() {
        return lookingFor;
    }

    public void setLookingFor(String lookingFor) {
        this.lookingFor = lookingFor;
    }

    public Boolean getChildren() {
        return children;
    }

    public void setChildren(Boolean children) {
        this.children = children;
    }

    public Boolean getWasMarried() {
        return wasMarried;
    }

    public void setWasMarried(Boolean wasMarried) {
        this.wasMarried = wasMarried;
    }

    //comparators

    // age
    //height
    //district
    //preferences
    //multiple comparator
}

