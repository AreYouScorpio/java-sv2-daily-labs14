package day01;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class OrderService {

    public static List<Order> orders = new ArrayList<>();


    public void findOrdersByStatus(String status) {
        int counter = 0;
        for (int i = 0; i < orders.size(); i++) {
            if (orders.get(i).getStatus().equals(status)) counter++;
        }
        System.out.println(counter);
    }

    public void findOrdersByStatus2(String status) {
        System.out.println(orders.stream().filter(p -> p.getStatus().equals(status)).count());

    }


    public static void main(String[] args) {
        OrderService orderService = new OrderService();


        Product p1 = new Product("Tv", "IT", 2000);
        Product p2 = new Product("Laptop", "IT", 2400);
        Product p3 = new Product("Phone", "IT", 400);
        Product p4 = new Product("Lord of The Rings", "Book", 20);
        Product p5 = new Product("Harry Potter Collection", "Book", 120);

        Order o1 = new Order("pending", LocalDate.of(2021, 06, 07));
        o1.addProduct(p1);
        o1.addProduct(p2);
        o1.addProduct(p5);

        Order o2 = new Order("on delivery", LocalDate.of(2021, 06, 01));
        o2.addProduct(p3);
        o2.addProduct(p1);
        o2.addProduct(p2);

        Order o3 = new Order("pending", LocalDate.of(2021, 06, 07));
        o3.addProduct(p1);
        o3.addProduct(p2);
        o3.addProduct(p5);

        Order o4 = new Order("on delivery", LocalDate.of(2021, 06, 01));
        o4.addProduct(p3);
        o4.addProduct(p1);
        o4.addProduct(p2);

        Order o5 = new Order("pending", LocalDate.of(2021, 06, 07));
        o5.addProduct(p1);
        o5.addProduct(p2);
        o5.addProduct(p5);

        orders.add(o1);
        orders.add(o2);
        orders.add(o3);
        orders.add(o4);
        orders.add(o5);

        orderService.findOrdersByStatus("pending");
        orderService.findOrdersByStatus2("pending");
    }


}
