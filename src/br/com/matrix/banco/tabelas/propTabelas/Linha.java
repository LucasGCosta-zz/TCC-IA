<<<<<<< HEAD
package br.com.matrix.banco.tabelas.propTabelas;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.interfaces.ILinha;

public class Linha implements ILinha {

	private ATabela tb;

	private ArrayList<Coluna> colunas;
	
	private ArrayList<Campo> campos;

	@Override
	public ATabela getTb() {

		return this.tb;
	}

	@Override
	public List<Coluna> getColunas() {

		return this.colunas;
	}
	
	public List<Campo> getCampos(){
		return this.campos;
	}
	
	@Override
	public HashMap<Coluna, Campo> get() {
		
		HashMap<Coluna, Campo> retorno = new HashMap<Coluna, Campo>();

		return retorno;
	}

	

}
=======
package br.com.matrix.banco.tabelas.propTabelas;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.interfaces.ILinha;

public class Linha implements ILinha {

	private ATabela tb;

	private ArrayList<Coluna> colunas;
	
	private ArrayList<Campo> campos;

	@Override
	public ATabela getTb() {

		return this.tb;
	}

	@Override
	public List<Coluna> getColunas() {

		return this.colunas;
	}
	
	public List<Campo> getCampos(){
		return this.campos;
	}
	
	@Override
	public HashMap<Coluna, Campo> get() {
		
		HashMap<Coluna, Campo> retorno = new HashMap<Coluna, Campo>();

		return retorno;
	}

	

}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
