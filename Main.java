package Assignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        Service service=new Service();
        boolean status=true;
        while(status){
            System.out.println("Select User");
            System.out.println("1: ADMIN");
            System.out.println("2: Customer");
            int choice=sc1.nextInt();

            if (choice==1){
                boolean wantToContinue=true;
                while (wantToContinue){
                    System.out.println("Select the the option");
                    System.out.println("1: Add new Pizza");
                    System.out.println("2: Add new Toppings");
                    System.out.println("3: Add new Sides");
                    System.out.println("4: EXIT");
                    int mode=sc1.nextInt();
                    switch (mode){
                        case 1:
                            addNewPizza(sc1,service);
                            break;
                        case 2:
                            addNewToppings(sc1,service);
                            break;
                        default:
                            wantToContinue=false;

                    }
                }
            } else if (choice==2) {

                boolean wantToContinue=true;
                while (wantToContinue){
                    System.out.println("Select Mode of Operation");
                    System.out.println("1:View Menu");
                    System.out.println("2:Customize order");
                    System.out.println("3:Confirm details & Place Order");
                    int mode= sc1.nextInt();
                    switch (mode){
                        case 1:
                            service.viewNonVegPizzas();
                            service.viewNonVegPizzas();
                            service.viewVegToppings();
                            service.viewNonVegToppings();
                            service.viewCrust();
                            service.viewSides();
                            break;

                        case 2:
                            System.out.println("Select pizza Category");
                            String category=sc1.next();
                            if ( category.equalsIgnoreCase(String:"veg")){
                                service.viewVegPizzas();
                            System.out.println("Enter Your Pizza Name");
                            String pizzaName= sc1.next();
                            System.out.println("Enter Qty");
                            int qty=sc1.nextInt();
                            service.viewVegToppings();
                            service.viewCrust();
                            System.out.println("Select toppings");
                            String toppingsName= sc1.next();
                            System.out.println("Select Crust");
                            String crustType= sc1.next();
                            service.viewSides();
                            String sideName= sc1.next();
                            Order ord=new Order(pizzaName,qty,toppingsName,crustType,sideName);
                            service.placeOrder(ord);

                            }




                    }
                }

            }
        }
    }
}
