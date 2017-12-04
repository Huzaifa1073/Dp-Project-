
public class PizzaFactory extends AbstractFactory {

	public IPizza getPizza(String Pizza) {
		if(Pizza==null)
		{
			return null;
		}
		if(Pizza.equalsIgnoreCase("Tikka"))
		{
			return new TikkaPizza();
		}
		if(Pizza.equalsIgnoreCase("Fajita"))
		{
			return new FajitaPizza();
		}
		if(Pizza.equalsIgnoreCase("SouceTikka"))
		{
			return new Sauce(new TikkaPizza());
		}
		return null;
	}

	IBurger getBurger(String Burger) {
		return null;
	}

	IColddrink getColdrink(String cold) {
		return null;
	}

}
