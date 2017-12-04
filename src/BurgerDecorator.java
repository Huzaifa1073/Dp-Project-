
public abstract class BurgerDecorator implements IBurger {

	protected IBurger burger;
	public BurgerDecorator(IBurger burger)
	{
		this.burger=burger;
	}
	public float cost() {
		return burger.cost();
	}

	public String name() {
		return burger.name();
	}

}
