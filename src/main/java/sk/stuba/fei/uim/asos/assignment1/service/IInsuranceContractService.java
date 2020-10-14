package sk.stuba.fei.uim.asos.assignment1.service;

import sk.stuba.fei.uim.asos.assignment1.domain.AbstractInsuranceContract;

import java.util.List;

/**
 * Interface pre Spring service pre správu poistných zmlúv.
 *
 * @param <T> Trieda poistnej zmluvy
 * @param <U> Trieda identifikátora používateľa
 */
public interface IInsuranceContractService<T extends AbstractInsuranceContract, U> {

    T create(T contract);

    T update(T contract);

    List<T> getAll();

    List<T> getByUserId(U userId);

}
