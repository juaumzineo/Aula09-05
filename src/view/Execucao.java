package view;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Execucao {

	public static void main(String[] args) {
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		
		pf.setNome("Joao");
		System.out.println(pf.getNome());
		
		pj.setRazaoSocial("Etec ZL");
		System.out.println(pj.getRazaoSocial());
		
		pf.falar();
		pj.falar();
	}

}
