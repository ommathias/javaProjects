package course;


public class Conta {

		private int numeroConta;
		private String nomeConta;
		private double deposito;
		private double saldo;
		
		public Conta (int numeroConta, String name, double deposito)
		{
			this.numeroConta = numeroConta;
		    this.nomeConta = name;
		    deposito(deposito);
		    this.saldo = deposito;  
		}
		
		public Conta (int numeroConta, String name)
		{
			this.numeroConta = numeroConta;
		    this.nomeConta = name;
		}
		
		
		public int getNumeroConta() {
			return numeroConta;
		}
		
		public String getNomeConta() {
			return nomeConta;
		}

		public void setNomeConta(String nomeConta) {
			this.nomeConta = nomeConta;
		}

		public double getDeposito() {
			return deposito;
		}
		
		public void saque(double valorSaque)
		{
			if(valorSaque > 0.0) {
			this.saldo -= (valorSaque+5);}
			
			else
				System.out.println("Saque tem que ser maior que zero");
			
		}
		
		public double getSaldo() {
			return saldo;
		}

		public void deposito(double valorDeposito)
		{
			this.saldo += valorDeposito;
		}
		
		public String toString ()
		{
			return "Conta: "
					+ numeroConta
					+" Titular: "
					+nomeConta
					+" Saldo: "
					+String.format("%.2f", saldo);
		}
		
			
}
