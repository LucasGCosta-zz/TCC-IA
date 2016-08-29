/**
 * 
 */
package br.com.matrix.evo.suporte;

import java.util.function.Function;

/**
 * Condicao usada para identificar entidades � serem removidas.
 * 
 * @param <G>
 *            - Tipagem do c�digo gen�tico
 * @param <R>
 *            - Tipagem do retorno das entidades
 *
 */
public interface CondicaoRemocaoEvo<G, R, P> extends Function<GrupoEntidadesEvo<G, R, P>, GrupoEntidadesEvo<G, R, P>> {

}