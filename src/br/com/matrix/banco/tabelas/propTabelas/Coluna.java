<<<<<<< HEAD
package br.com.matrix.banco.tabelas.propTabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.AColuna;
import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;

public class Coluna extends AColuna{

	public Coluna(String nm, ATabela tb) {
		super(nm, tb);
	}
	
	public String getApNm(){
		return getTb().getApelido()+"."+getNm();
	}

}
=======
package br.com.matrix.banco.tabelas.propTabelas;

import br.com.matrix.banco.tabelas.classesAbstratas.AColuna;
import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;

public class Coluna extends AColuna{

	public Coluna(String nm, ATabela tb) {
		super(nm, tb);
	}
	
	public String getApNm(){
		return getTb().getApelido()+"."+getNm();
	}

}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
