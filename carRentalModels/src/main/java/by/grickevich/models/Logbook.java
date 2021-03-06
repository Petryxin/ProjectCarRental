package by.grickevich.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "logbook")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class Logbook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "damageCar")
    private String damageCar;

    @Column(name = "descriptionDamage")
    private String descriptionDamage;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Car car;

    @OneToOne(fetch = FetchType.LAZY, mappedBy= "logbook",cascade = CascadeType.ALL)
    @JsonIgnore
    private RepairBill repairBill;

    @OneToMany(cascade = CascadeType.ALL)
    @Fetch(FetchMode.JOIN)
    @JoinTable(joinColumns = @JoinColumn(name = "logbook_id"), inverseJoinColumns = @JoinColumn(name = "admin_id"))
    private Set<Administrator> admins = new HashSet<Administrator>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Set<Administrator> getAdmins() {
        return admins;
    }

    public void setAdmins(Set<Administrator> admins) {
        this.admins = admins;
    }

    public RepairBill getRepairBill() {
        return repairBill;
    }

    public void setRepairBill(RepairBill repairBill) {
        this.repairBill = repairBill;
    }
}
