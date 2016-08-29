package br.com.matrix.evo.suporte;

import java.util.function.Function;

/**
 * Interface de mutacao para EntidadePadrao
 * 
 * @param <G>
 *            - Tipagem do c�digo gen�tico
 */
public interface Mutar<G> extends Function<CodigoGenEvo<G>, CodigoGenEvo<G>> {

}
