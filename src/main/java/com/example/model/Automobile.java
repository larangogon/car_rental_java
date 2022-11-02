package com.example.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "automobile")
public class Automobile implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String brand_id;
     @Column
    private String description;
    @Column
    private String line;
    @Column
    private int stock;
    @Column
    private String status; // enu () (Disponible o Alquilado) OR bool
    @Column
    private String license_plate;

    public Automobile() {
    }

    public Automobile(int id, String brand_id, double line, int stock, int status, String license_plate, String description) {
        this.id = id;
        this.brand_id = brand_id;
        this.line = line;
        this.stock = stock;
        this.status = status;
        this.license_plate = license_plate;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand_id;
    }

    public void setBrand(String brand_id) {
        this.brand_id = brand_id;
    }

    public double getLine() {
        return line;
    }

    public void setLine(double line) {
        this.line = line;
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

    public String getLicensePlate() {
        return license_plate;
    }

    public void seticense_plate(String license_plate) {
        this.license_plate = license_plate;
    }

       public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
