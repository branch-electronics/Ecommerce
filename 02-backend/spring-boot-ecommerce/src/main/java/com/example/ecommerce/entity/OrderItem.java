package com.example.ecommerce.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name="order_item")
@Getter
@Setter
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="image_url")
    private String imageUrl;

    @Column(name="unit_price")
    private BigDecimal unitPrice;

    @Column(name="quantity")
    private int quantity;

    @Column(name="product_id")
    private Long productId;

    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order order;

//    public void setOrder(Order order) {
//        this.order=order;
//    }
//    public Order getOrder(){
//        return this.order;
//    }
//    public void setId(Long id) {
//        this.id=id;
//    }
//    public Long getId(){
//        return this.id;
//    }
//    public void setProductId(Long productId) {
//        this.productId=productId;
//    }
//    public Long getProductId(){
//        return productId;
//    }
//    public void setImageUrl(String imageUrl) {
//        this.imageUrl=imageUrl;
//    }
//    public String getImageUrl(){
//        return imageUrl;
//    }
//    public void setUnitPrice(BigDecimal unitPrice) {
//        this.unitPrice=unitPrice;
//    }
//    public BigDecimal getUnitPrice(){
//        return this.unitPrice;
//    }
//    public void setQuantity(int quantity) {
//        this.quantity=quantity;
//    }
//    public int getQuantity(){
//        return this.quantity;
//    }
}
