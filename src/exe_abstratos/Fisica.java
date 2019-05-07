package exe_abstratos;

public class Fisica extends Pessoa {

	private double gastoSaude;

	public Fisica(String nome, Double rendaAnual, double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public Double tax() {
		if(getRendaAnual() < 20000)
		{
		    return getRendaAnual() * 0.15 - gastoSaude *0.5;
			
		
		}
		
		else {
			return getRendaAnual() * 0.25 - gastoSaude *0.5;
				
		}
	}
	
	
}
