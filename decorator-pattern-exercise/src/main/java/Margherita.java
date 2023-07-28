import java.util.ArrayList;

public class Margherita implements Pizza {

  static ArrayList toppings = new ArrayList<String>();
  static String name = "Margherita";

  public Margherita() {
    toppings.add("cheese");
    toppings.add("tomato");
  }


  public ArrayList getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }



}
