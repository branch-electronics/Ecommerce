package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="customer")
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

//    public void setId(Long id){
//        this.id=id;
//    }
//
//    public Long getId(){
//        return this.id;
//    }

    @Column(name="first_name")
    private String firstName;

//    public void setFirstName(String firstName){
//        this.firstName=firstName;
//    }
//
//    public String getFirstName(){
//        return this.firstName;
//    }

    @Column(name="last_name")
    private String lastName;

//    public void setLastName(String lastName){
//        this.lastName=lastName;
//    }
//
//    public String getLastName(){
//        return this.lastName;
//    }

    @Column(name="email")
    private String email;

//    public void setEmail(String email){
//        this.email=email;
//    }
//
//    public String getEmail(){
//        return this.email;
//    }

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<Order> orders = new HashSet<>();

    public void add(Order order) {

        if (order != null) {

            if (orders == null) {
                orders = new HashSet<>();
            }

            orders.add(order);
            order.setCustomer(this);
        }
    }
}
