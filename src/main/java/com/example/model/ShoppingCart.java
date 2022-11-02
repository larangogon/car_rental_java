package ar.edu.larioja.control.stock.Models;

import org.omg.PortableInterceptor.INACTIVE;

import javax.persistence.*;

@Entity
@Table(name = "shopping_cart")
public class ShoppingCart {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;

    @Column(name = "User_id")
    private String User_id;

    @Column(name = "Automobile_id")
    private String Total;

     @Column(name = "Stock")
    private String Stock;

      @Column(name = "Total")
    private String Total;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStock() {
        return Stock;
    }

    public void setStatus(String stock) {
        Stock = Stock;
    }

    public String getTotal() {
        return Total;
    }

    public void setUserId(String user_id) {
        User_id = user_id;
    }

     public String getAutomobileId() {
        return Prouct_id;
    }

    public void setAutomobileId(String automobile_id) {
        Automobile_id = automobile_id;
    }

      public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }
}