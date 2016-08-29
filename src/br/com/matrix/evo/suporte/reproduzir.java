package br.com.matrix.evo.suporte;

import java.util.function.BiFunction;

/**
 * 
 * @author GustavoHenrique
 * 
 *         Interface de reprodu��o para entidadePadrao
 *
 * @param <G>
 *            - Tipagem do codigo gen�tico
 * @param <R>
 *            - Tipagem do retorno das entidades
 * @param <P>
 *            - Parametro de execucao
 */
public interface reproduzir<G, R, P>
		extends BiFunction<GrupoEntidadesEvo<G, R, P>, Integer, GrupoEntidadesEvo<G, R, P>> {

}
