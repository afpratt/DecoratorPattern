
public class Name extends JerseyDecorator{
	Jersey jersey;
	
	public Name (Jersey jersey) {
		this.jersey = jersey;
	}
	
	public String getDescription() {
		return jersey.getDescription() + ", Name";
	}
	
	public double cost() {
		return jersey.cost() + 10.25;
	}

}
