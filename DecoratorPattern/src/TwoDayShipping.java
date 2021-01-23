
public class TwoDayShipping extends JerseyDecorator{
	Jersey jersey;
	
	public TwoDayShipping (Jersey jersey) {
		this.jersey = jersey;
	}
	
	public String getDescription() {
		return jersey.getDescription() + ", Two Day Shipping";
	}
	
	public double cost() {
		return jersey.cost() + 14.49;
	}

}
