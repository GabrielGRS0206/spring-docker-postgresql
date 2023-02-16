package br.com.io.github.container.web.controller;

import br.com.io.github.container.domain.service.ProductService;
import br.com.io.github.container.web.dto.response.ProductResponseDto;
import br.com.io.github.container.web.mapper.ProductMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService service;
    private final ProductMapper mapper;

    public ProductController(ProductService service, ProductMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @GetMapping("/id")
    public ProductResponseDto findById(long id){
        return mapper.toDto(service.findBydId(id));
    }

    @GetMapping
    public List<ProductResponseDto> findAll(){
        return mapper.listToDto(service.findAll());
    }

}
