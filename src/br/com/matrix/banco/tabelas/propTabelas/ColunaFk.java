<<<<<<< HEAD
package br.com.matrix.banco.tabelas.propTabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;

public class ColunaFk extends Coluna{

	public ColunaFk(Coluna colunaRef,String nm, ATabela tabela) {
		super(nm, tabela);
		
		this.colunaRef = colunaRef;
	}
	
	private Coluna colunaRef;

	public Coluna getColunaRef() {
		return colunaRef;
	}
}
=======
package br.com.matrix.banco.tabelas.propTabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;

public class ColunaFk extends Coluna{

	public ColunaFk(Coluna colunaRef,String nm, ATabela tabela) {
		super(nm, tabela);
		
		this.colunaRef = colunaRef;
	}
	
	private Coluna colunaRef;

	public Coluna getColunaRef() {
		return colunaRef;
	}
}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
