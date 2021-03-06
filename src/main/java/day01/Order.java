package day01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class Order{

    private String status;
    private LocalDate date;
    public  List<Product> products = new ArrayList<>();

    public  List<Product> getProducts() {
        return products;
    }

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

    public int getSumPieces(){
        return products.stream().mapToInt(p-> p.getPiece()).sum();
    }


    @Override
    public String toString() {
        return "Order{" +
                "status='" + status + '\'' +
                ", date=" + date +
                ", products=" + products +
                '}';
    }
}
