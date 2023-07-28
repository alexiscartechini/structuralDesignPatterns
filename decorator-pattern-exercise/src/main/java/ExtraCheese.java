import java.util.ArrayList;
public class ExtraCheese implements Pizza{

    ArrayList<String> toppings = new ArrayList<>();
    Pizza pizza;

    public ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public ArrayList getToppings() {
        toppings = pizza.getToppings();
        toppings.add("extra cheese");
        return toppings;
    }

    @Override
    public String getName() {
        return pizza.getName();
    }
}
