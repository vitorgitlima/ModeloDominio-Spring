package com.devsuperior.demo.entities;

import javax.persistence.*;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="tb_order")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant moment;
    private OrderStatus status;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @OneToMany(mappedBy = "order")
    private List<OrderItem> items = new ArrayList<>();


    public Order(){

    }
    public Order(Long id, Instant moment, OrderStatus status, Client client) {
        this.id = id;
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public double getTotal(){
        double sum = 0.0;
        for (OrderItem item : items){
            sum = sum + item.getSubTotal();
        }
        return sum;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getMoment() {
        return moment;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }
}
