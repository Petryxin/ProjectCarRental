package by.grickevich.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Logbook.class)
public abstract class Logbook_ {

	public static volatile SingularAttribute<Logbook, String> damageCar;
	public static volatile SingularAttribute<Logbook, RepairBill> repairBill;
	public static volatile SingularAttribute<Logbook, Car> car;
	public static volatile SingularAttribute<Logbook, String> descriptionDamage;
	public static volatile SingularAttribute<Logbook, Integer> id;
	public static volatile SetAttribute<Logbook, Administrator> admins;

	public static final String DAMAGE_CAR = "damageCar";
	public static final String REPAIR_BILL = "repairBill";
	public static final String CAR = "car";
	public static final String DESCRIPTION_DAMAGE = "descriptionDamage";
	public static final String ID = "id";
	public static final String ADMINS = "admins";

}

