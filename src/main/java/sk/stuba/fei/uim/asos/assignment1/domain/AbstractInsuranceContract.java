package sk.stuba.fei.uim.asos.assignment1.domain;

/**
 * Abstraktná trieda poistnej zmluvy.
 *
 * @param <T> Trieda identifikátora zmluvy
 */
public abstract class AbstractInsuranceContract<T> {

    protected T id;

    public T getId() {
        return id;
    }
}
