package by.grickevich.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AutoParts.class)
public abstract class AutoParts_ {

	public static volatile SetAttribute<AutoParts, Car> cars;
	public static volatile SingularAttribute<AutoParts, String> cost;
	public static volatile SingularAttribute<AutoParts, Long> id;
	public static volatile SingularAttribute<AutoParts, String> autoPart;

	public static final String CARS = "cars";
	public static final String COST = "cost";
	public static final String ID = "id";
	public static final String AUTO_PART = "autoPart";

}

