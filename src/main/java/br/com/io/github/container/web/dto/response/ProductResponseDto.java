package br.com.io.github.container.web.dto.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponseDto {
    private long id;
    private String description;
}
