package dev.webservices.liquorstoreapi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
public class Customer {

    @Id
    @GeneratedValue
    @ToString.Exclude
    private Long id;
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String address;
    
}
