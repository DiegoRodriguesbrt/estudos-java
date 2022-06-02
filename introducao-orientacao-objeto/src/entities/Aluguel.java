package entities;

public class Aluguel {
	
	private String nomeDoLocatario;
	private String emailDoLocatario;
	
	public Aluguel(String nomeDoLocatario, String emailDoLocatario) {
		this.nomeDoLocatario = nomeDoLocatario;
		this.emailDoLocatario = emailDoLocatario;
	}

	public String getNomeDoLocatario() {
		return nomeDoLocatario;
	}

	public void setNomeDoLocatario(String nomeDoLocatario) {
		this.nomeDoLocatario = nomeDoLocatario;
	}

	public String getEmailDoLocatario() {
		return emailDoLocatario;
	}

	public void setEmailDoLocatario(String emailDoLocatario) {
		this.emailDoLocatario = emailDoLocatario;
	}

	public String toString() {
		return nomeDoLocatario + ", " + emailDoLocatario;
	}
	
}
		
	

