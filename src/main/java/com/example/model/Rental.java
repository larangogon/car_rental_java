package ar.edu.larioja.control.stock.Models;

import org.omg.PortableInterceptor.INACTIVE;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;

    @Column(name = "Status")
    private String Status;

    @Column(name = "Total")
    private String Total;

     @Column(name = "shopping_cart_id")
    private String Shopping_cart_id;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String total) {
        Total = total;
    }

     public String getShoppingCartId() {
        return shopping_cart_id;
    }

    public void setShoppingCartId(String shopping_cart_id) {
        Shopping_cart_id = shopping_cart_id;
    }
}
