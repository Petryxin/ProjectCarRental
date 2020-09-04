package by.grickevich.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "administrator")
public class Administrator {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "admins", fetch = FetchType.EAGER)
    private Set<Logbook> logbook = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Logbook> getLogbook() {
        return logbook;
    }

    public void setLogbook(Set<Logbook> logbook) {
        this.logbook = logbook;
    }

    //прием машины,
    //её осмотр - выбор поврежденных элементов если такие присутствуют
    //выставляет счет
    //отдельная база с клиентами и поврежденными машинами (либо только суммой за ремонт)
    //возможность отклонить заявку, указав причины отказа

}
