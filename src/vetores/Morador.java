package vetores;

public class Morador {

	
	private String nome;
	private String mail;
	private int quarto;
	
	
	public Morador(String nome, String mail, int quarto) {
		this.nome = nome;
		this.mail = mail;
		this.quarto = quarto;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public int getQuarto() {
		return quarto;
	}
	public void setQuarto(int quarto) {
		this.quarto = quarto;
	}
	
	public String toString() {
		return nome + ", " + mail;
		}

	
	
}
