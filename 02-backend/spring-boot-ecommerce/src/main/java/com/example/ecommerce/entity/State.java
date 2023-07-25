package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "state")
@Getter
@Setter
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

//    public void setId(int id){
//        this.id=id;
//    }
//    public void setName(String name){
//        this.name=name;
//    }
//    public void setCountry(Country country){
//        this.country=country;
//    }
//    public int getId(){
//        return this.id;
//    }
//    public String getName(){
//        return this.name;
//    }
//    public Country getCountry(){
//        return this.country;
//    }
}
