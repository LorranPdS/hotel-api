package br.com.potential.hotel.interfaces;

import br.com.potential.hotel.dto.requests.ExtraChargesRequest;
import br.com.potential.hotel.dto.responses.ExtraChargesResponse;

public interface ExtraChargesService {

    ExtraChargesResponse save(ExtraChargesRequest extraChargesRequest);

}
