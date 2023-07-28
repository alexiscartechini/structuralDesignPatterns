public class Main {

  public static void main(String[] args) {
      Pizza margherita = new Margherita();
      margherita = new ExtraCheese(margherita);
      Pizza hawaiian = new Hawaiian();
      Pizza pepperoni = new Pepperoni();
      Pizza pepperoniWithExtraCheese = new ExtraCheese(new Pepperoni());

      order(margherita);
      order(hawaiian);
      order(pepperoni);
      order(pepperoniWithExtraCheese);
  }

  public static void order(Pizza pizza) {
    System.out.println("You have ordered a " + pizza.getName() +
        " pizza. The toppings are " + pizza.getToppings() + ".");
  }

}
