
public class Cheese extends BurgerDecorator {
	public Cheese(IBurger burger)
	{
		super(burger);
	}
	public String name()
	{
		return burger.name()+" "+setCheese();
	}
	public float cost()
	{
		return burger.cost()+setCost();
	}
	public String setCheese()
	{
		return " With Cheese ";
	}
	public float setCost()
	{
		return 50f;
	}
}
