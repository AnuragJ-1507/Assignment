package Assignment;


import java.util.LinkedHashMap;
import java.util.Map;

public interface Sides {
    Map<String,Double> sideSet=new LinkedHashMap<>();

    void addNewSides(String sideName,double sidePrice);
    void viewSides();


}
