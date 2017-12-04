
public class DealBuilder {
	public Deal Deal1()
	{
		System.out.println("Deal # 01");
		Deal meal = new Deal();
		meal.addItem(new FajitaPizza(),new ZingerBurger(),new Pepsi());
		return meal;
	}
	public Deal Deal2()
	{
		System.out.println("Deal # 02");
		Deal meal = new Deal();
		meal.addItem(new TikkaPizza(),new ChickenBurger(),new Mirinda());
		return meal;
	}
}
