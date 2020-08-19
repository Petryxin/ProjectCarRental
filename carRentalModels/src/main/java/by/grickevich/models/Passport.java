package by.grickevich.models;



import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;

import java.util.Set;

@Entity
@Table(name = "Passport")
public class Passport{

    public Passport() {
    }

    public Passport(Long id, String passportSerial, String passportNumber, String dateOfIssue, String dateOfExpiry, String countryOfIssue, String surname, String name) {
        this.id = id;
        this.passportSerial = passportSerial;
        this.passportNumber = passportNumber;
        this.dateOfIssue = dateOfIssue;
        this.dateOfExpiry = dateOfExpiry;
        this.countryOfIssue = countryOfIssue;
        this.surname = surname;
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

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

    @OneToMany(cascade = CascadeType.ALL)
    @Fetch(FetchMode.JOIN)
    @JoinTable(joinColumns = @JoinColumn(name = "passport_id"), inverseJoinColumns = @JoinColumn(name = "order_id"))
    private Set<Order> orders = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
