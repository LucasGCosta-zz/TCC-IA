package br.com.matrix.evo.suporte;

import java.util.function.Function;

/**
 * Interface de padronizacao de c�digo gen�tico para EntidadePadrao
 * 
 * @param <G>
 *            - Tipagem do c�digo gen�tico
 */
public interface PadronizarCodigoGenetico<G> extends Function<CodigoGenEvo<G>, CodigoGenEvo<G>> {

}
