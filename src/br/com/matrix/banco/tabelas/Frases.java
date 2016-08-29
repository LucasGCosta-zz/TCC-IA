<<<<<<< HEAD
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;

public class Frases extends ATabela {

	private Frases() {
		super("Frases", "fr");

		getColunas().add(new Coluna("id", this));
		getColunas().add(new Coluna("ds", this));

	}

	/**
	 * refer�ncia da tabela
	 */
	private static Frases ref;

	public static Frases get() {
		return (ref == null) ? ref = new Frases() : ref;
	}

}
=======
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;

public class Frases extends ATabela {

	private Frases() {
		super("Frases", "fr");

		getColunas().add(new Coluna("id", this));
		getColunas().add(new Coluna("ds", this));

	}

	/**
	 * refer�ncia da tabela
	 */
	private static Frases ref;

	public static Frases get() {
		return (ref == null) ? ref = new Frases() : ref;
	}

}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
