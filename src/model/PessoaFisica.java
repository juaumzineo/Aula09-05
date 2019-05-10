package model;

public class PessoaFisica extends Pessoa{
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void falar() {
		// TODO Auto-generated method stub
		System.out.println("Falando - Pessoa Fisica");
	}
}
