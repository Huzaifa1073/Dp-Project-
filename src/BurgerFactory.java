
public class BurgerFactory extends AbstractFactory {

	IPizza getPizza(String Pizza) {
		return null;
	}

	IBurger getBurger(String Burger) {
		if(Burger==null)
		{
			return null;
		}
		if(Burger.equalsIgnoreCase("Zinger"))
		{
			return new ZingerBurger();
		}
		if(Burger.equalsIgnoreCase("Chiken"))
		{
			return new ChickenBurger();
		}
		if(Burger.equalsIgnoreCase("CheeseBurger"))
		{
			return new Cheese(new ChickenBurger());
		}
		return null;
	}

	IColddrink getColdrink(String cold) {
		return null;
	}

}
