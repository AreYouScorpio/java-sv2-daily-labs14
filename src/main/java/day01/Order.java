package day01;

import java.time.LocalDate;
import java.util.List;



public class Order{

    private String status;
    private LocalDate date;
    private List<Product> products;


    public Order(String status, LocalDate date, List<Product> products) {
        this.status = status;
        this.date = date;
    }

    public Order(String status, LocalDate date) {
        this.status = status;
        this.date = date;
    }



    public String getStatus() {
        return status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void addProduct(Product product){
        products.add(product);
    }


}
