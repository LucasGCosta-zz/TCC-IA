<<<<<<< HEAD
package br.com.matrix.evo.suporte;

/**
 * 
 *         Fitness é um valor quantitativo da adaptação ao ambiente.
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
=======
package br.com.matrix.evo.suporte;

/**
 * 
 *         Fitness é um valor quantitativo da adaptação ao ambiente.
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
>>>>>>> 1892e8f1965c2584f67cd745b53a6ee402a9cbc4
