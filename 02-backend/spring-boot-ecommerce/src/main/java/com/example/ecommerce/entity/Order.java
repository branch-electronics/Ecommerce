package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.util.*;

@Entity
@Table(name="orders")
@Getter
@Setter

public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="order_tracking_number")
    private String orderTrackingNumber;

    @Column(name="total_quantity")
    private int totalQuantity;
//    public void setTotalQuantity(int totalQuantity){
//        this.totalQuantity=totalQuantity;
//    }
//    public int getTotalQuantity(){
//        return this.totalQuantity;
//    }

    @Column(name="total_price")
    private BigDecimal totalPrice;
//    public void setTotalPrice(BigDecimal totalPrice){
//        this.totalPrice=totalPrice;
//    }
//    public BigDecimal getTotalPrice(){
//        return this.totalPrice;
//    }

    @Column(name="status")
    private String status;

//    public void setStatus(String status){
//        this.status=status;
//    }
//    public String getStatus(){
//        return this.status;
//    }

    @Column(name="date_created")
    @CreationTimestamp
    private Date dateCreated;

    @Column(name="last_updated")
    @UpdateTimestamp
    private Date lastUpdated;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
    private List<OrderItem> orderItems;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shipping_address_id", referencedColumnName = "id")
    private Address shippingAddress;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "billing_address_id", referencedColumnName = "id")
    private Address billingAddress;

    public void add(OrderItem item) {

        if (item != null) {
            if (orderItems == null) {
                orderItems = new ArrayList<OrderItem>();
            }

            orderItems.add(item);
            item.setOrder(this);
        }
    }

//    public void setCustomer(Customer customer) {
//        this.customer=customer;
//    }
//    public Customer getCustomer(){
//        return this.customer;
//    }
//    public void setOrderTrackingNumber(String orderTrackingNumber) {
//        this.orderTrackingNumber=orderTrackingNumber;
//    }
//    public String getOrderTrackingNumber(){
//        return this.orderTrackingNumber;
//    }
//    public void setBillingAddress(Address billingAddress) {
//        this.billingAddress=billingAddress;
//    }
//    public Address getBillingAddress(){
//        return this.billingAddress;
//    }
//    public void setShippingAddress(Address shippingAddress) {
//        this.shippingAddress=shippingAddress;
//    }
//    public Address getShippingAddress(){
//        return this.shippingAddress;
//    }
}
