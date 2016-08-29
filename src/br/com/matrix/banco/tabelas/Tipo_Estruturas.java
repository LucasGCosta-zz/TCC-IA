<<<<<<< HEAD
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;

public class Tipo_Estruturas extends ATabela {

	private Tipo_Estruturas() {
		super("Tipo_Estruturas", "te");

		getColunas().add(new Coluna("id", this));
		getColunas().add(new Coluna("ds", this));

	}

	/**
	 * referência da tabela
	 */
	private static Tipo_Estruturas ref;

	public static Tipo_Estruturas get() {
		return (ref == null) ? ref = new Tipo_Estruturas() : ref;
	}

}
=======
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;

public class Tipo_Estruturas extends ATabela {

	private Tipo_Estruturas() {
		super("Tipo_Estruturas", "te");

		getColunas().add(new Coluna("id", this));
		getColunas().add(new Coluna("ds", this));

	}

	/**
	 * referência da tabela
	 */
	private static Tipo_Estruturas ref;

	public static Tipo_Estruturas get() {
		return (ref == null) ? ref = new Tipo_Estruturas() : ref;
	}

}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
