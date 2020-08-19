package by.grickevich.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Car.class)
public abstract class Car_ {

	public static volatile SingularAttribute<Car, String> carType;
	public static volatile SingularAttribute<Car, Double> carPrice;
	public static volatile SetAttribute<Car, Order> orders;
	public static volatile SingularAttribute<Car, Long> id;
	public static volatile SetAttribute<Car, Logbook> logs;
	public static volatile SingularAttribute<Car, Integer> year_of_issue;
	public static volatile SingularAttribute<Car, String> carModel;

	public static final String CAR_TYPE = "carType";
	public static final String CAR_PRICE = "carPrice";
	public static final String ORDERS = "orders";
	public static final String ID = "id";
	public static final String LOGS = "logs";
	public static final String YEAR_OF_ISSUE = "year_of_issue";
	public static final String CAR_MODEL = "carModel";

}

