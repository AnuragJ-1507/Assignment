package Assignment;

import java.util.LinkedHashMap;
import java.util.Map;
public interface ExtraToppings {
    Map<String,Double> vegToppings=new LinkedHashMap<>();
    Map<String,Double> nonVegToppings=new LinkedHashMap<>();

    void addNewToppings(String toppingsType,String toppingsName,double price);

     void viewVegToppings();
    void viewNonVegToppings();

}
