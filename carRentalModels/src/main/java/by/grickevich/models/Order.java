package by.grickevich.models;

import com.fasterxml.jackson.annotation.JsonIgnore;


import javax.persistence.*;


@Entity
@Table(name = "user_order")
public class Order{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "rentalTime")
    private String rentalTime;

    @Column(name = "totalRentPrice")
    private String totalRentPrice; //type String or Double

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Car car;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Passport passport;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRentalTime() {
        return rentalTime;
    }

    public void setRentalTime(String rentalTime) {
        this.rentalTime = rentalTime;
    }

    public String getTotalRentPrice() {
        return totalRentPrice;
    }

    public void setTotalRentPrice(String totalRentPrice) {
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