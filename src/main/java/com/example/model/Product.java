package com.example.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String category_id;
     @Column
    private String description;
    @Column
    private double price;
    @Column
    private int stock;
    @Column
    private int status;
    @Column
    private String name;

    public Product() {
    }

    public Product(int id, String category_id, double price, int stock, int status, String name, String description) {
        this.id = id;
        this.category_id = category_id;
        this.price = price;
        this.stock = stock;
        this.status = status;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category_id;
    }

    public void setCategory(String category_id) {
        this.category_id = category_id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

       public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
