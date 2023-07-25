package com.example.ecommerce.dto;

import com.example.ecommerce.entity.Address;
import com.example.ecommerce.entity.Customer;
import com.example.ecommerce.entity.Order;
import com.example.ecommerce.entity.OrderItem;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@Data
@Getter
@Setter

public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

//    public void setCustomer(Customer customer){ this.customer=customer; }
//    public Customer getCustomer(){ return this.customer;}
//
//    public void setOrder(Order order){
//        this.order=order;
//    }
//    public Order getOrder() {
//        return this.order;
//    }
//
//    public void setShippingAddress(Address shippingAddress){
//        this.shippingAddress=shippingAddress;
//    }
//    public Address getShippingAddress() {
//        return this.shippingAddress;
//    }
//
//    public void setBillingAddress(Address billingAddress){
//        this.billingAddress=billingAddress;
//    }
//    public Address getBillingAddress() {
//        return billingAddress;
//    }
//
//    public void setOrderItems(OrderItem orderItem){
//        if(orderItems.size()==0){
//            orderItems=new ArrayList<OrderItem>();
//        }
//        this.orderItems.add(orderItem);
//    }
//    public List<OrderItem> getOrderItems(){
//        return this.orderItems;
//    }

}
