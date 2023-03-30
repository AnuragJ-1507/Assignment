package Assignment;


import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public class Service implements ExtraToppings,Sides{

    List<Model> vegPizza=new ArrayList<>();
    List<Model> nonVegPizza=new ArrayList<>();

    List<Order> orderList=new ArrayList<>();

    public void addNewPizzaToInventory(String pizzaType,String name ,String size,double price){
        Model model=new Model(name,size,price);
        if (pizzaType.equalsIgnoreCase(anotherString:"VEG"){
            vegPizza.add(model);
        }else{
            nonVegPizza.add(model);
        }
        System.out.println("New Pizza Added To Inventory");

    }

    public void viewVegPizzas () {
        System.out.println("VEG PIZZA 'S");
        System.out.println("===================================");
        for (Model p : vegPizza) {
            System.out.println(p);
        }
        System.out.println("========================================");
    }

    public void viewNonVegPizzas () {
        System.out.println("NON-VEG PIZZA'S");
        System.out.println("=============================================");
        for (Model p : nonVegPizza) {
            System.out.println(p);
        }

        System.out.println("==========================================");
    }
    @Override
    public void addNewSides(String sideName,double sidePrice){
        sideSet.put(sideName,sidePrice);
        System.out.println("New Sides Added Successfully");

    }
    @Override
    public void viewSides(){
        System.out.println("SIDES");
        System.out.println("=====================================");
        Set<Map.Entry<String,Double>> entries=sideSet.entrySet();
        for (Map.Entry<String,Double> e:entries){
            System.out.println("============================");
        }
        System.out.println("===============================");
    }


    @Override
    public void addNewToppings(String toppingType,String toppingsName,double price){
        if (toppingType.equalsIgnoreCase(String:"VEG")){
            vegToppings.put(toppingsName,price);
        } else {
            nonVegToppings.put(toppingsName,price);
        }
        System.out.println("NEW TOPPING ADDED TO INVENTORY");
    }





    @Override
    public void viewVegToppings(){
        System.out.println("VEG TOPPINGS");
        System.out.println("==================================");
        Set<Map.Entry<String,Double>> vegEntries=vegToppings.entrySet();
        for (Map.Entry<String,Double> e:vegEntries){
            System.out.println(e.getKey()+"/t"+e.getValue());
        }
    }

    @Override
    public void viewNonVegToppings(){
        System.out.println("NON-VEG TOPPINGS");
        System.out.println("==================================");
        Set<Map.Entry<String,Double>> nonVegEntries=nonVegToppings.entrySet();
        for (Map.Entry<String,Double> e:nonVegEntries){
            System.out.println(e.getKey()+"/t"+e.getValue());
        }
        System.out.println("=========================================");
        System.out.println("VEG TOPPINGS");
        System.out.println("===========================================");
        Set<Map.Entry<String,Double>> vegEntries=vegToppings.entrySet();
        for (Map.Entry<String,Double> e:vegEntries){
            if (!e.getKey().equals("Paneer")){
                System.out.println(e.getKey()+"/t"+e.getValue());

            }
        }
        System.out.println("============================================");
    }


    public void viewCrust(){
        System.out.println("Crust");
        System.out.println("===============================================");
        Crust[] data=Crust.values();
        for (Crust c:data){
            System.out.println(c);
        }
        System.out.println("===============================================");

    }
    public void placeOrder(Order orderRef){
        orderList.add(orderRef);
    }
 }
