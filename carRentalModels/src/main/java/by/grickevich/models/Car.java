package by.grickevich.models;


import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "carType")
    private String carType; //50/50

    @Column(name = "yearOfIssue")
    private Integer year_of_issue;

    @Column(name = "carModel")
    private String carModel;

    @Column(name = "carPrice")
    private Double carPrice;

    //@ManyToMany(mappedBy = "cars",cascade = CascadeType.ALL)
    //@JsonIgnore
    //private Set<AutoParts> autoParts = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    @Fetch(FetchMode.JOIN)
    @JoinTable(joinColumns = @JoinColumn(name = "car_id"), inverseJoinColumns = @JoinColumn(name = "order_id"))
    private Set<Order> orders = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL)
    @Fetch(FetchMode.JOIN)
    @JoinTable(joinColumns = @JoinColumn(name = "car_id"), inverseJoinColumns = @JoinColumn(name = "order_id"))
    private Set<Logbook> logs = new HashSet<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public Integer getYear_of_issue() {
        return year_of_issue;
    }

    public void setYear_of_issue(Integer year_of_issue) {
        this.year_of_issue = year_of_issue;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Double carPrice) {
        this.carPrice = carPrice;
    }

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public Set<Logbook> getLogs() {
        return logs;
    }

    public void setLogs(Set<Logbook> logs) {
        this.logs = logs;
    }
}
