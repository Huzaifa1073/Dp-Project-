
public class Sauce extends PizzaDecorator {
	public Sauce(IPizza pizza)
	{
		super(pizza);
	}
	public String name()
	{
		return piz.name()+" "+setSauce();
	}
	public float cost()
	{
		return piz.cost()+setCost();
	}
	public String setSauce()
	{
		return " With Sauce ";
	}
	public float setCost()
	{
		return 40f;
	}
}
