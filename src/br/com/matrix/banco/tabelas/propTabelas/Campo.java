<<<<<<< HEAD
package br.com.matrix.banco.tabelas.propTabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.AColuna;
import br.com.matrix.banco.tabelas.interfaces.ICampo;

public class Campo implements ICampo{

	private AColuna coluna;
	
	private Object valor;

	public AColuna getColuna() {
		return coluna;
	}

	public Object getValor() {
		return valor;
	}

	public Campo(AColuna coluna, Object valor){
		this.valor = valor;
		this.coluna = coluna;
	}
}
=======
package br.com.matrix.banco.tabelas.propTabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.AColuna;
import br.com.matrix.banco.tabelas.interfaces.ICampo;

public class Campo implements ICampo{

	private AColuna coluna;
	
	private Object valor;

	public AColuna getColuna() {
		return coluna;
	}

	public Object getValor() {
		return valor;
	}

	public Campo(AColuna coluna, Object valor){
		this.valor = valor;
		this.coluna = coluna;
	}
}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
