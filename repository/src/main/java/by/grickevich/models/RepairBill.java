package by.grickevich.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "repair_bill")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer"})
public class RepairBill {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "repair_amount")
    private Double repairAmount;

    @Column(name = "description_repair")
    private String descriptionRepair;

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "logbook_id", referencedColumnName = "id")
    private Logbook logbook;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getRepairAmount() {
        return repairAmount;
    }

    public void setRepairAmount(Double repairAmount) {
        this.repairAmount = repairAmount;
    }

    public Logbook getLogbook() {
        return logbook;
    }

    public void setLogbook(Logbook logbook) {
        this.logbook = logbook;
    }

    public String getDescriptionRepair() {
        return descriptionRepair;
    }

    public void setDescriptionRepair(String descriptionRepair) {
        this.descriptionRepair = descriptionRepair;
    }
}
