package br.com.potential.hotel.services;

import br.com.potential.hotel.dto.requests.ExtraChargesRequest;
import br.com.potential.hotel.dto.responses.ExtraChargesResponse;
import br.com.potential.hotel.entity.ExtraChargesEntity;
import br.com.potential.hotel.interfaces.ExtraChargesService;
import br.com.potential.hotel.repositories.ExtraChargesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExtraChargesServiceImpl implements ExtraChargesService {

    @Autowired
    private ExtraChargesRepository repository;

    @Override
    public ExtraChargesResponse save(ExtraChargesRequest extraChargesRequest) {
    // sempre lembrar de criar validations (ver se campos foram preenchidos e tal) e lançar as exceptions
        var extraChargesEntity = repository.save(ExtraChargesEntity.of(extraChargesRequest));
        return ExtraChargesResponse.of(extraChargesEntity);
    }

}
