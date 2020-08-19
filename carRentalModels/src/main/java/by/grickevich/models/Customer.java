package by.grickevich.models;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
public class Customer {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "login")
    private String login;

    @Column(name = "password")
    private String password;


    //maybe login and password

}
