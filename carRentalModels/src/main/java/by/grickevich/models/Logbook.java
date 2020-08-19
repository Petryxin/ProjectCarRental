package by.grickevich.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "logbook")
public class Logbook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "arrivalDate")
    private String arrivalDate;

    @Column(name = "damageCar")
    private String damageCar;

    @Column(name = "descriptionDamage")
    private String descriptionDamage;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Car car;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getDamageCar() {
        return damageCar;
    }

    public void setDamageCar(String damageCar) {
        this.damageCar = damageCar;
    }

    public String getDescriptionDamage() {
        return descriptionDamage;
    }

    public void setDescriptionDamage(String descriptionDamage) {
        this.descriptionDamage = descriptionDamage;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
