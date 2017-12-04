public class ItemFactory {
	public static final String[] names = {"Deal1", "Deal2", "Tikka","Fajita","TikkaSouce","Zinger","Chiken","ChikenCheese","pepsi","mirinda"};
	public static AbstractItem getItem(String name)
	{
		for (int i = 0; i < names.length; i++) {
	         if (names[i].equalsIgnoreCase(name)){ 
	            return new RealItem(name);
	         }
	      }
	      return new NullItem();
	}
}
