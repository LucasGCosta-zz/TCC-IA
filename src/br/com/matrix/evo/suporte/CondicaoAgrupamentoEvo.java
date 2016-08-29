<<<<<<< HEAD
/**
 * 
 */
package br.com.matrix.evo.suporte;

import java.util.List;
import java.util.function.Function;

/**
 * Condicao usada para agrupar entidades para gerarem novas entidades.
 * 
 * @param <G>
 *            - Tipagem do código genético
 * @param <R>
 *            - Tipagem do retorno das entidades
 *
 */
public abstract interface CondicaoAgrupamentoEvo<G, R, P>
		extends Function<GrupoEntidadesEvo<G, R, P>, List<GrupoEntidadesEvo<G, R, P>>> {

}
=======
/**
 * 
 */
package br.com.matrix.evo.suporte;

import java.util.List;
import java.util.function.Function;

/**
 * Condicao usada para agrupar entidades para gerarem novas entidades.
 * 
 * @param <G>
 *            - Tipagem do código genético
 * @param <R>
 *            - Tipagem do retorno das entidades
 *
 */
public abstract interface CondicaoAgrupamentoEvo<G, R, P>
		extends Function<GrupoEntidadesEvo<G, R, P>, List<GrupoEntidadesEvo<G, R, P>>> {

}
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
