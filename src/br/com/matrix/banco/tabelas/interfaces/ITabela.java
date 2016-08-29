<<<<<<< HEAD
package br.com.matrix.banco.tabelas.interfaces;

import java.util.List;

import br.com.matrix.banco.tabelas.propTabelas.Coluna;
import br.com.matrix.banco.tabelas.propTabelas.ColunaFk;

public interface ITabela {
	
    /**
     * 
     * @return uma lista de dependencias da tabela(pode ser uma dependencia inversa para nevagação intra tabelas)
     */
    public List<ColunaFk> getDependecias();  
    
    /**
     * 
     * @return uma lista com as colunas da tabela
     */
    public List<Coluna> getColunas();
    
    /**
     * 
     * @return nome da tabela
     */
    public String getNm();
    
    /**
     * 
     * @return apelido da tabela para ser usado como referêcnia nos selects e nos joins
     */
    public String getApelido();
        
    /**
     * 
     * @return a própria tabela
     */
    public static ITabela get() {
		return null;
	}
    
    default boolean equals(ITabela t){
    	return getNm().equals(t.getNm());
    }    
}
=======
package br.com.matrix.banco.tabelas.interfaces;

import java.util.List;

import br.com.matrix.banco.tabelas.propTabelas.Coluna;
import br.com.matrix.banco.tabelas.propTabelas.ColunaFk;

public interface ITabela {
	
    /**
     * 
     * @return uma lista de dependencias da tabela(pode ser uma dependencia inversa para nevagação intra tabelas)
     */
    public List<ColunaFk> getDependecias();  
    
    /**
     * 
     * @return uma lista com as colunas da tabela
     */
    public List<Coluna> getColunas();
    
    /**
     * 
     * @return nome da tabela
     */
    public String getNm();
    
    /**
     * 
     * @return apelido da tabela para ser usado como referêcnia nos selects e nos joins
     */
    public String getApelido();
        
    /**
     * 
     * @return a própria tabela
     */
    public static ITabela get() {
		return null;
	}
    
    default boolean equals(ITabela t){
    	return getNm().equals(t.getNm());
    }    
}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
