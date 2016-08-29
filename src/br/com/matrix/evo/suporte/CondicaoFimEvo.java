package br.com.matrix.evo.suporte;

import java.util.function.Predicate;

/**
 * Condi��o fim, usado para determinar at� quando continuar� a executar,
 * reproduzir e eliminar a entidades EVO.
 * 
 * @param <F>
 *            - Tipagem da entrada da condi��o fim para rodar as entidades
 */
public abstract interface CondicaoFimEvo<F> extends Predicate<F> {
}
