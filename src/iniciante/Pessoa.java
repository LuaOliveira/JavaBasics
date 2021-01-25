package iniciante;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Pessoa {

	// atributos
	private String nome;
	private int maxLivros;
	private int idade;
	
	// construtor
	public Pessoa() {
	
	nome= "Nome desconhecido";
	maxLivros= 3;
	
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String qualquerNome) {
		nome = qualquerNome;
		
	}

	public int getMaxLivros() {
		return maxLivros;
	}

	public void setMaxLivros(int maxLivros) {
		//this opcional neste caso
		this.maxLivros = maxLivros;
	}
	
}
