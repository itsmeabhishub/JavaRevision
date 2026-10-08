package OOPSIntQJ;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

interface Product{
    String getName();
    double getPrice();
}

class Mobile implements Product{
    String productName;
    double price;
    Mobile(String productName, double price){
        this.productName = productName;
        this.price = price;
    }
    public String getName(){
        return productName;
    }
    public  double getPrice(){
        return price;
    }
}

class Laptop implements Product{
    String productName;
    double price;
    Laptop(String productName, double price){
        this.productName = productName;
        this.price = price;
    }

    public String getName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }

}

class TV implements Product{
    String productName;
    double price;

    TV(String productName, double price){
        this.productName = productName;
        this.price = price;
    }

    public String getName(){
        return productName;
    }

    public double getPrice(){
        return price;
    }
}

public class CollectionInterfaceJQ {
    public static void main(String[] args) {
        List<Product> prudct = Arrays.asList(
                new Laptop("Lenovo think pad", 75000),
                new Laptop("HP Elite book", 78000),
                new Mobile("Samsung A56", 47000),
                new Mobile("iPhone 18", 97000),
                new TV("Samsung LED TV", 70000)
        );

        prudct.stream()
                .filter(n -> n.getPrice() > 50000)
                .forEach(n -> System.out.println(n.getName() + " " + n.getPrice()));

        System.out.println("--------------------------------------------------------------------------");

       Product prd=  prudct.stream()
                .min((n1, n2) -> Double.compare(n1.getPrice(),n2.getPrice())).get();
        System.out.println(prd.getPrice());

        System.out.println("--------------------------------------------------------------------------");

       Product expPrdt = prudct.stream()
               .max((n1,n2) -> Double.compare(n1.getPrice(), n2.getPrice())).get();
        System.out.println(expPrdt.getPrice());

        System.out.println("--------------------------------------------------------------------------");

       prudct.stream()
               .sorted((n1,n2) -> Double.compare(n2.getPrice(), n1.getPrice()))
               .forEach(n -> System.out.println(n.getName() + " " + n.getPrice()));

        System.out.println("--------------------------------------------------------------------------");

       prudct.stream()
               .map(n -> n.getName())
               .forEach(n -> System.out.println(n));

    }
}
