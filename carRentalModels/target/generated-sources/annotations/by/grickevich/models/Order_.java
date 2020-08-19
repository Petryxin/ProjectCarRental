package by.grickevich.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SingularAttribute<Order, Passport> passport;
	public static volatile SingularAttribute<Order, Car> car;
	public static volatile SingularAttribute<Order, String> rentalTime;
	public static volatile SingularAttribute<Order, Long> id;
	public static volatile SingularAttribute<Order, String> totalRentPrice;

	public static final String PASSPORT = "passport";
	public static final String CAR = "car";
	public static final String RENTAL_TIME = "rentalTime";
	public static final String ID = "id";
	public static final String TOTAL_RENT_PRICE = "totalRentPrice";

}

