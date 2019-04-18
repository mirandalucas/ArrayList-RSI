

public class Diretor {

	String nomeDiretor;
	String datanasc;
	
	public Diretor() {
	
	}

	public Diretor(String nome, String datanasc) {
		this.nomeDiretor = nome;
		this.datanasc = datanasc;
	}

	public String getNome() {
		return nomeDiretor;
	}

	public void setNome(String nome) {
		this.nomeDiretor = nome;
	}

	public String getDatanasc() {
		return datanasc;
	}

	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	
	
}
