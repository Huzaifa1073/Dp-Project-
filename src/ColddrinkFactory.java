
public class ColddrinkFactory extends AbstractFactory {
	IPizza getPizza(String Pizza) {
		return null;
	}
	IBurger getBurger(String Burger) {
		return null;
	}
	IColddrink getColdrink(String cold) {
		if(cold==null)
		{
			return null;
		}
		if(cold.equalsIgnoreCase("Mirinda"))
		{
			return new Mirinda();
		}
		if(cold.equalsIgnoreCase("Pepsi"))
		{
			return new Pepsi();
		}
		return null;
	}
}
