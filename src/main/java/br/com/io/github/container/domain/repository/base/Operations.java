package br.com.io.github.container.domain.repository.base;

import br.com.io.github.container.domain.model.Product;

import java.util.List;
import java.util.Optional;

public interface Operations<T> {

    Optional<T> findBydId(long id);

    List<Product> findAll();

}
