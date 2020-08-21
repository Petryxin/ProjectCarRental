package by.grickevich.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Passport.class)
public abstract class Passport_ {

	public static volatile SingularAttribute<Passport, String> passportNumber;
	public static volatile SingularAttribute<Passport, String> dateOfExpiry;
	public static volatile SingularAttribute<Passport, String> passportSerial;
	public static volatile SingularAttribute<Passport, String> countryOfIssue;
	public static volatile SingularAttribute<Passport, String> surname;
	public static volatile SingularAttribute<Passport, String> name;
	public static volatile SetAttribute<Passport, Order> orders;
	public static volatile SingularAttribute<Passport, Integer> id;
	public static volatile SingularAttribute<Passport, String> dateOfIssue;

	public static final String PASSPORT_NUMBER = "passportNumber";
	public static final String DATE_OF_EXPIRY = "dateOfExpiry";
	public static final String PASSPORT_SERIAL = "passportSerial";
	public static final String COUNTRY_OF_ISSUE = "countryOfIssue";
	public static final String SURNAME = "surname";
	public static final String NAME = "name";
	public static final String ORDERS = "orders";
	public static final String ID = "id";
	public static final String DATE_OF_ISSUE = "dateOfIssue";

}

