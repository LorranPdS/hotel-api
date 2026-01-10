package br.com.potential.hotel.interfaces;

import br.com.potential.hotel.dto.requests.ExtraChargesRequest;
import br.com.potential.hotel.dto.responses.ExtraChargesResponse;
import br.com.potential.hotel.dto.responses.PageResponseDto;
import org.springframework.data.domain.Pageable;

public interface ExtraChargesService {

    PageResponseDto<ExtraChargesResponse> findAll(Pageable pagination);

    ExtraChargesResponse save(ExtraChargesRequest extraChargesRequest);

}
