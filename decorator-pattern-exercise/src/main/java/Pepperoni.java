import java.util.ArrayList;

public class Pepperoni implements Pizza {

  static ArrayList toppings = new ArrayList<String>();
  static String name = "Pepperoni";

  public Pepperoni() {
    toppings.add("cheese");
    toppings.add("tomato");
    toppings.add("pepperoni");
  }


  public ArrayList getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }

}
