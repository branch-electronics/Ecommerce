package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="address")
@Getter
@Setter
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

//    public void setId(Long id){
//        this.id=id;
//    }
//    public Long getId(){
//        return this.id;
//    }

    @Column(name="city")
    private String city;

//    public void setCity(String city){
//        this.city=city;
//    }
//    public String getCity(){
//        return this.city;
//    }

    @Column(name="street")
    private String street;

//    public void setStreet(String street){
//        this.street=street;
//    }
//    public String getStreet(){
//        return this.street;
//    }
    @Column(name="state")
    private String state;

//    public void setState(String state){
//        this.state=state;
//    }
//    public String getState(){
//        return this.state;
//    }

    @Column(name="country")
    private String country;
//    public void setCountry(String country){
//        this.country=country;
//    }
//    public String getCountry(){
//        return this.country;
//    }

    @Column(name="zip_code")
    private String zip_code;
//    public void setZip_code(String zip_code){
//        this.zip_code=zip_code;
//    }
//    public String getZip_code(){
//        return this.zip_code;
//    }

    @OneToOne
    @PrimaryKeyJoinColumn
    private Order order;
//    public void setOrder(Order order){
//        this.order=order;
//    }
//    public Order getOrder(){
//        return this.order;
//    }
}
