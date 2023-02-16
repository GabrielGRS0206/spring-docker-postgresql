package br.com.io.github.container.web.mapper;

import br.com.io.github.container.domain.model.Product;
import br.com.io.github.container.web.dto.response.ProductResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class ProductMapper {
    public ProductResponseDto toDto(Optional<Product> product) {
        return ProductResponseDto.builder().id(product.get().getId()).description(product.get().getDescription()).build();
    }

    public List<ProductResponseDto> listToDto(List<Product> list) {
        return list.stream().map(e -> toDto(Optional.ofNullable(e))).collect(Collectors.toList());
    }
}
