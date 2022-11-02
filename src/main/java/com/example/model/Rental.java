package ar.edu.larioja.control.stock.Models;

import org.omg.PortableInterceptor.INACTIVE;

import javax.persistence.*;

@Entity
@Table(name = "rentalS")
public class Rental {

    //Register a rental
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "Id")
    private Long Id;

    @Column(name = "Status") //iniciado o finalizado (entregado o en uso)
    private String status;

    @Column(name = "date_rental_initial")
    private String date_rental_initial;

     @Column(name = "date_rental_finish")
    private String date_rental_finish;

    @Column(name = "Total_days_rental")
    private String total_days_rental;

     @Column(name = "user_id")
    private int user_id;

    @Column(name = "automobile_id")
    private int automobile_id;


    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

      public Long getDateRentalInitial() {
        return date_rental_initial;
    }

    public void setDateRentalInitial(Long date_rental_initial) {
        Id = date_rental_initial;
    }

    public Long getDateRentalFinish() {
        return date_rental_finish;
    }

    public void setDateRentalFinish(Long date_rental_finish) {
        Id = date_rental_finish;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        status = status;
    }

    public String getTotalDaysRental() {
        return total_days_rental;
    }

    public void setTotalDaysRental(String total_days_rental) {
        total_days_rental = total_days_rental;
    }

     public String getUserId() {
        return user_id;
    }

    public void setUserId(String user_id) {
        User_id = user_id;
    }

       public String getAutomobileId() {
        return automobile_id;
    }

    public void setAutomobileId(String user_id) {
        automobile_id = automobile_id;
    }
}
