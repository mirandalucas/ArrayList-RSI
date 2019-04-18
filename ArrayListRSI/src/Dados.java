import java.util.ArrayList;

public class Dados {
	ArrayList<Diretor> cadDiretor = new ArrayList();
	ArrayList<Filme> cadFilme = new ArrayList();
	
	
	public void CadastroDiretor(Diretor diretor)
	{
		cadDiretor.add(diretor);
	}
	
	public void CadastroFilme(Filme filme)
	{
		cadFilme.add(filme);
	}
}
