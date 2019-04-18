
public class Filme {

	String nomeFilme;
	String anoLancamento;
	
	public Filme(){}

	public Filme(String nomeFilme, String anoLancamento) {
		this.nomeFilme = nomeFilme;
		this.anoLancamento = anoLancamento;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public String getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(String anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
}
