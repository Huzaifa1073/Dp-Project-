public class FactoryProducer {
	 public static AbstractFactory getFactory(String choice){
		 
		 if(choice.equalsIgnoreCase("Pizza"))
		 {
			 return new PizzaFactory();
		 }
		 if(choice.equalsIgnoreCase("Burger"))
		 {
			 return new BurgerFactory();
		 }
		 if(choice.equalsIgnoreCase("Coldrink"))
		 {
			 return new ColddrinkFactory();
		 }
		 return null;
	 }
}
