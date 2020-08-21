package by.grickevich.models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Tenant.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Tenant, Reason> reason;
	public static volatile SingularAttribute<Tenant, String> password;
	public static volatile SingularAttribute<Tenant, Integer> id;
	public static volatile SingularAttribute<Tenant, String> login;

	public static final String REASON = "reason";
	public static final String PASSWORD = "password";
	public static final String ID = "id";
	public static final String LOGIN = "login";

}

