package br.com.io.github.container.domain.service;

import br.com.io.github.container.domain.model.Product;
import br.com.io.github.container.domain.repository.ProductRepository;
import br.com.io.github.container.domain.repository.base.Operations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements Operations<Product> {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Product> findBydId(long id) {
        return repository.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }
}
