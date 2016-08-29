<<<<<<< HEAD
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;
import br.com.matrix.banco.tabelas.propTabelas.ColunaFk;

public class Estruturas extends ATabela {
	
	private Estruturas() {
		super("Estruturas","es");

		getDependecias().add(new ColunaFk(new Coluna("id", Tipo_Estruturas.get()) ,"id_t", this));

		getColunas().add(new Coluna("id",this));
		getColunas().add(new Coluna("ds", this));
		getColunas().addAll(getDependecias());
	}

	/**
	 * referência da tabela
	 */
	private static Estruturas ref;

	public static Estruturas get() {
		return (ref == null) ? ref = new Estruturas() : ref;
	}
	
}
=======
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;
import br.com.matrix.banco.tabelas.propTabelas.ColunaFk;

public class Estruturas extends ATabela {
	
	private Estruturas() {
		super("Estruturas","es");

		getDependecias().add(new ColunaFk(new Coluna("id", Tipo_Estruturas.get()) ,"id_t", this));

		getColunas().add(new Coluna("id",this));
		getColunas().add(new Coluna("ds", this));
		getColunas().addAll(getDependecias());
	}

	/**
	 * referência da tabela
	 */
	private static Estruturas ref;

	public static Estruturas get() {
		return (ref == null) ? ref = new Estruturas() : ref;
	}
	
}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
