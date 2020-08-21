package by.grickevich.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


import javax.persistence.*;


@Entity
@Table(name = "user_order")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "rentalTime")
    private String rentalTime;

    @Column(name = "totalRentPrice")
    private Double totalRentPrice; //type String or Double

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Car car;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Passport passport;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRentalTime() {
        return rentalTime;
    }

    public void setRentalTime(String rentalTime) {
        this.rentalTime = rentalTime;
    }

    public Double getTotalRentPrice() {
        return totalRentPrice;
    }

    public void setTotalRentPrice(Double totalRentPrice) {
        this.totalRentPrice = totalRentPrice;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}