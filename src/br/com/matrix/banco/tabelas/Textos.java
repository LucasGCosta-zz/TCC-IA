<<<<<<< HEAD
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;

public class Textos extends ATabela {

	private Textos() {
		super("Textos", "tx");

		getColunas().add(new Coluna("id", this));

	}

	/**
	 * referência da tabela
	 */
	private static Textos ref;

	public static Textos get() {
		return (ref == null) ? ref = new Textos() : ref;
	}

}
=======
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;

public class Textos extends ATabela {

	private Textos() {
		super("Textos", "tx");

		getColunas().add(new Coluna("id", this));

	}

	/**
	 * referência da tabela
	 */
	private static Textos ref;

	public static Textos get() {
		return (ref == null) ? ref = new Textos() : ref;
	}

}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
