public abstract class PizzaDecorator implements IPizza {
	protected IPizza piz;
	public PizzaDecorator(IPizza pizza)
	{
		this.piz=pizza;
	}
	public String name() {
		return piz.name();
	}
	public float cost() {
		return piz.cost();
	}

}
