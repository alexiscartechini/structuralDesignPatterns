import java.util.ArrayList;

public class Hawaiian implements Pizza {

  static ArrayList toppings = new ArrayList<String>();
  static String name = "Hawaiiian";

  public Hawaiian() {
    toppings.add("cheese");
    toppings.add("tomato");
    toppings.add("ham");
    toppings.add("pineapple");
  }


  public ArrayList getToppings() {
    return toppings;
  }

  public String getName() {
    return name;
  }

}
