package ex_herança_poli;

public class ImportedProduct extends Product {

	private Double customsFee;

	
	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}
	
	@Override
	public String priceTag()
	{
		return ("This price is: " + super.getPrice() + " Taxa: "+customsFee);
	}
	
	public Double totalPrice()
	{
		double sum = super.getPrice() + customsFee;
		return sum;
	}
}
