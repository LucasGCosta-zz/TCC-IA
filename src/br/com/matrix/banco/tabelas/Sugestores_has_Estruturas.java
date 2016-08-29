<<<<<<< HEAD
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;
import br.com.matrix.banco.tabelas.propTabelas.ColunaFk;

public class Sugestores_has_Estruturas extends ATabela {

	private Sugestores_has_Estruturas() {
		super("Sugestores_has_Estruturas", "she");

		getDependecias().add(new ColunaFk(Estruturas.get().getId(), "id_s", this));
		getDependecias().add(new ColunaFk(Sugestores.get().getId(), "id_e", this));
		
		getColunas().add(new Coluna("id", this));
		getColunas().addAll(getDependecias());
	}

	/**
	 * referência da tabela
	 */
	private static Sugestores_has_Estruturas ref;

	public static Sugestores_has_Estruturas get() {
		return (ref == null) ? ref = new Sugestores_has_Estruturas() : ref;
	}


}
=======
package br.com.matrix.banco.tabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;
import br.com.matrix.banco.tabelas.propTabelas.ColunaFk;

public class Sugestores_has_Estruturas extends ATabela {

	private Sugestores_has_Estruturas() {
		super("Sugestores_has_Estruturas", "she");

		getDependecias().add(new ColunaFk(Estruturas.get().getId(), "id_s", this));
		getDependecias().add(new ColunaFk(Sugestores.get().getId(), "id_e", this));
		
		getColunas().add(new Coluna("id", this));
		getColunas().addAll(getDependecias());
	}

	/**
	 * referência da tabela
	 */
	private static Sugestores_has_Estruturas ref;

	public static Sugestores_has_Estruturas get() {
		return (ref == null) ? ref = new Sugestores_has_Estruturas() : ref;
	}


}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
