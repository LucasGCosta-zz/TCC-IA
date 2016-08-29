<<<<<<< HEAD
package br.com.matrix.banco.tabelas.interfaces;

import java.util.HashMap;
import java.util.List;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Campo;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;

public interface ILinha {

	public ATabela getTb();
	
	public List<Coluna> getColunas();
	
	public HashMap<Coluna, Campo> get();
	
}
=======
package br.com.matrix.banco.tabelas.interfaces;

import java.util.HashMap;
import java.util.List;

import br.com.matrix.banco.tabelas.classesAbstratas.ATabela;
import br.com.matrix.banco.tabelas.propTabelas.Campo;
import br.com.matrix.banco.tabelas.propTabelas.Coluna;

public interface ILinha {

	public ATabela getTb();
	
	public List<Coluna> getColunas();
	
	public HashMap<Coluna, Campo> get();
	
}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
