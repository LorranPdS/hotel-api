package br.com.potential.hotel.dto.responses;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class PageResponseDto<T> {

    private List<T> content;
    private Long totalElements;
    private Integer totalPages;
}
