/**
 * 
 */
package br.com.matrix.banco.tabelas.interfaces;

import java.util.HashMap;
import java.util.List;

import br.com.matrix.banco.tabelas.propTabelas.Coluna;

/**
 * @author LucasGabrielDaCosta
 *
 */
public interface IArmazenavel {

	/**
	 * 
	 * @return ITabela que contem o c�digo identificador do objeto armazen�vel.
	 */
	public ITabela getTb();

	/**
	 * 
	 * @return A lista de armazenaveis dependentes, isso �, referenciados aqui.
	 */
	public List<IArmazenavel> getDependencias();

	/**
	 * 
	 * @return C�digo identificador do objeto armazen�vel.
	 */
	public int getId();

	/**
	 * 
	 * @return A lista de valores dos campos da classa que implementa
	 *         armazenavel.
	 */
	public HashMap<Coluna, Object> getValores();

	/**
	 * 
	 * @param a
	 * @return metodo de compara��o especifico para armazenavel
	 */
	public default boolean equals(IArmazenavel a) {
		if (this == a)
			return true;
		if (a == null)
			return false;
		if (getClass() != a.getClass())
			return false;
		if (this.getId() != a.getId())
			return false;
		return ((getTb() == null) ? (a.getTb() == null) : getTb().equals(a.getTb()) && (getId() == a.getId()));
	}

}
