/**
 * 
 */
package br.com.matrix.evo;

import java.util.ArrayList;
import java.util.List;

import br.com.matrix.evo.suporte.CondicaoAgrupamentoEvo;
import br.com.matrix.evo.suporte.CondicaoFimEvo;
import br.com.matrix.evo.suporte.CondicaoRemocaoEvo;
import br.com.matrix.evo.suporte.GrupoEntidadesEvo;

/**
 * Interface que gerencia um grupo de entidades evo, executando Crosover,
 * mutacao, etc...S
 * 
 *
 * @param <G>
 *            - Tipagem do c�digo gen�tico
 * @param <R>
 *            - Tipagem do retorno das entidades
 * @param <F>
 *            - Tipagem da entrada da condi��o fim para rodar as entidades
 * @param <P>
 *            - Parametro de execucao
 */
public interface GerenciadorEvo<G, R, P, F> {
    /**
     * 
     * @param cF
     *            - Condi��o fim, usado para determinar at� quando continuar�.
     */
    public void rodarLE(CondicaoFimEvo<F> cF);

    /**
     * 
     * @param cA
     *            - Condi��o de agrupamento, usada para determinar os grupos de
     *            genitores.
     * 
     * @param qtGrupo
     *            - quantidade de novos indivividuos por grupo reprodutorio;
     */
    public default void reproduzirLE(CondicaoAgrupamentoEvo<G, R, P> cA, int qtGrupo) {
	List<GrupoEntidadesEvo<G, R, P>> lG = cA.apply(getLE());
	for (GrupoEntidadesEvo<G, R, P> g : lG) {
	    getLE().addAll(g.get(0).reproduzir(g, qtGrupo));
	}
    }

    /**
     * 
     * @param cR
     *            - Condi��o de remo��o, usada para determinar as entidades �
     *            serem removidas.
     */
    public default void removerLE(CondicaoRemocaoEvo<G, R, P> cR) {
	ArrayList<EntidadeEvo<G, R, P>> grupo = cR.apply(getLE());
	getLE().removeAll(grupo);
    }

    /**
     * Constroi a lista de entidades se estiver nula
     * 
     * @return lista de entidades.
     */
    GrupoEntidadesEvo<G, R, P> getLE();
}
