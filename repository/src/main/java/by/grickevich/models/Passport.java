package by.grickevich.models;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Passport")
public class Passport{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "identification_number")
    private String passportSerial;

    @Column(name = "passport_number")
    private String passportNumber;

    @Column(name = "date_of_issue")
    private String dateOfIssue;

    @Column(name = "date_of_expiry")
    private String dateOfExpiry;

    @Column(name = "country")
    private String countryOfIssue;

    @Column(name = "surname")
    private String surname;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "passport" , fetch = FetchType.EAGER)
    private Set<Order> orders = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPassportSerial() {
        return passportSerial;
    }

    public void setPassportSerial(String passportSerial) {
        this.passportSerial = passportSerial;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getDateOfExpiry() {
        return dateOfExpiry;
    }

    public void setDateOfExpiry(String dateOfExpiry) {
        this.dateOfExpiry = dateOfExpiry;
    }

    public String getCountryOfIssue() {
        return countryOfIssue;
    }

    public void setCountryOfIssue(String countryOfIssue) {
        this.countryOfIssue = countryOfIssue;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }
}
