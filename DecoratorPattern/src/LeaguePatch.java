
public class LeaguePatch extends JerseyDecorator{
	Jersey jersey;
	
	public LeaguePatch (Jersey jersey) {
		this.jersey = jersey;
	}
	
	public String getDescription() {
		return jersey.getDescription() + ", League Patch";
	}
	
	public double cost() {
		return jersey.cost() + 5.25;
	}
}
