package by.grickevich.models;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "reason")
public class Reason {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nameOfReason") //нарушение пдд,  авария,                     мелкие повреждения
    private String nameOfReason;

    @Column(name = "description")//проезд на красный, сильные повреждения машины, царапины
    private String description;

    @OneToOne(fetch = FetchType.LAZY, mappedBy= "reason",cascade = CascadeType.ALL)
    @JsonIgnore
    private Tenant tenant;

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfReason() {
        return nameOfReason;
    }

    public void setNameOfReason(String nameOfReason) {
        this.nameOfReason = nameOfReason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
