<<<<<<< HEAD
package br.com.matrix.banco.tabelas;


import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;

public class Pontuacoes extends ATabela {

	private Pontuacoes() {
		super("Pontuacoes", "pon");
		
		getColunas().add(new Coluna("id", this));
		getColunas().add(new Coluna("ds", this));
		
	}

	/**
	 * referência da tabela
	 */
	private static Pontuacoes ref;

	
	public static Pontuacoes get(){
		return ref == null ? ref = new Pontuacoes() : ref;
	}

	
}
=======
package br.com.matrix.banco.tabelas;


import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;

public class Pontuacoes extends ATabela {

	private Pontuacoes() {
		super("Pontuacoes", "pon");
		
		getColunas().add(new Coluna("id", this));
		getColunas().add(new Coluna("ds", this));
		
	}

	/**
	 * referência da tabela
	 */
	private static Pontuacoes ref;

	
	public static Pontuacoes get(){
		return ref == null ? ref = new Pontuacoes() : ref;
	}

	
}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
