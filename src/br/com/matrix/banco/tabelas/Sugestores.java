<<<<<<< HEAD
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;

public class Sugestores extends ATabela {

	private Sugestores() {
		super("Sugestores", "su");

		getColunas().add(new Coluna("id", this));
		getColunas().add(new Coluna("qt_uso", this));
		getColunas().add(new Coluna("qt_acerto", this));
		getColunas().add(new Coluna("dt", this));

	}

	/**
	 * referência da tabela
	 */
	private static Sugestores ref;

	public static Sugestores get() {
		return (ref == null) ? ref = new Sugestores() : ref;
	}

}
=======
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;

public class Sugestores extends ATabela {

	private Sugestores() {
		super("Sugestores", "su");

		getColunas().add(new Coluna("id", this));
		getColunas().add(new Coluna("qt_uso", this));
		getColunas().add(new Coluna("qt_acerto", this));
		getColunas().add(new Coluna("dt", this));

	}

	/**
	 * referência da tabela
	 */
	private static Sugestores ref;

	public static Sugestores get() {
		return (ref == null) ? ref = new Sugestores() : ref;
	}

}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
