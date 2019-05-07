package exe_abstratos;

public class Juridica extends Pessoa {

	private int numeroFunc;

	public Juridica(String nome, Double rendaAnual, int numeroFunc) {
		super(nome, rendaAnual);
		this.numeroFunc = numeroFunc;
	}
	
	

	public int getNumeroFunc() {
		return numeroFunc;
	}



	public void setNumeroFunc(int numeroFunc) {
		this.numeroFunc = numeroFunc;
	}



	@Override
	public Double tax() {
		if( numeroFunc > 10)
		{
			return getRendaAnual()* 0.14;
			}
		
		else
		{
			return getRendaAnual()*0.16;
		}
	}
	
	
}
