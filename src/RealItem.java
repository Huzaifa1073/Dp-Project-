
public class RealItem extends AbstractItem  {
	public RealItem(String name_)
	{
		this.name=name_;
	}
	public boolean isNil() {
		return false;
	}
	public String getName() {
		return "You Ordered "+name ;
	}

}
