
public class OnlineSoccerJerseyShop {

	public static void main(String[] args) {
		Jersey jersey = new Chelsea();
		System.out.println(jersey.getDescription() + " $" + jersey.cost());
	
		Jersey jersey2 = new ManchesterUnited();
		jersey2 = new LeaguePatch(jersey2);
		System.out.println(jersey2.getDescription() + " $" + jersey2.cost());
		
		Jersey jersey3 = new Arsenal();
		jersey3 = new Number(jersey3);
		System.out.println(jersey3.getDescription() + " $" + jersey3.cost());
		
		Jersey jersey4 = new TottenhamHotspur();
		jersey4 = new Name(jersey4);
		System.out.println(jersey4.getDescription() + " $" + jersey4.cost());
		
		Jersey jersey5 = new Liverpool();
		jersey5 = new TwoDayShipping(jersey5);
		System.out.println(jersey5.getDescription() + " $" + jersey5.cost());
		
		Jersey jersey6 = new ManchesterCity();
		jersey6 = new LeaguePatch(jersey6);
		jersey6 = new Number(jersey6);
		jersey6 = new Name(jersey6);
		jersey6 = new TwoDayShipping(jersey6);
		System.out.println(jersey6.getDescription() + " $" + jersey6.cost());
	}

}
