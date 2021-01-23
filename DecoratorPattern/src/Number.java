
public class Number extends JerseyDecorator{
	Jersey jersey;
	
	public Number (Jersey jersey) {
		this.jersey = jersey;
	}
	
	public String getDescription() {
		return jersey.getDescription() + ", Number";
	}
	
	public double cost() {
		return jersey.cost() + 7.75;
	}

}
