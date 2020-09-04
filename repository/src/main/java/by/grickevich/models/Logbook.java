package by.grickevich.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "logbook")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class Logbook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "descriptionDamage")
    private String descriptionDamage;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "car_id")
    private Car carForLogs;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "admin_id")
    private Administrator admins;

    @OneToOne(fetch = FetchType.LAZY, mappedBy= "logbook")
    @JsonIgnore
    private RepairBill repairBill;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescriptionDamage() {
        return descriptionDamage;
    }

    public void setDescriptionDamage(String descriptionDamage) {
        this.descriptionDamage = descriptionDamage;
    }

    public Car getCarForLogs() {
        return carForLogs;
    }

    public void setCarForLogs(Car carForLogs) {
        this.carForLogs = carForLogs;
    }

    public Administrator getAdmins() {
        return admins;
    }

    public void setAdmins(Administrator admins) {
        this.admins = admins;
    }

    public RepairBill getRepairBill() {
        return repairBill;
    }

    public void setRepairBill(RepairBill repairBill) {
        this.repairBill = repairBill;
    }
}
