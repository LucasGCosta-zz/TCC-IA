package br.com.matrix.evo.suporte;

/**
 * 
 *         Fitness � um valor quantitativo da adapta��o ao ambiente.
 */
public interface FitnessEvo extends Comparable<FitnessEvo> {

    /**
     * 
     * @return - O valor Double desse Fitness
     */
    public Double get();

    @Override
    public default int compareTo(FitnessEvo o) {
	return o.get().compareTo(this.get());
    }
}
