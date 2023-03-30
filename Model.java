package Assignment;

public class Model {
    private String pizzaName;
    private String pizzaType;
    private double pizzaPrice;


    public Model(String pizzaName,String pizzaType,double pizzaPrice ){
        this.pizzaName=pizzaName;
        this.pizzaType=pizzaType;
        this.pizzaPrice=pizzaPrice;
    }

    public String getPizzaName(){ return pizzaName;}

    public void setPizzaName(String pizzaName){ this.pizzaName=pizzaName;}
}
