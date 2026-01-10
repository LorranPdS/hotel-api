package br.com.potential.hotel.controllers;

import br.com.potential.hotel.dto.requests.ExtraChargesRequest;
import br.com.potential.hotel.dto.responses.ExtraChargesResponse;
import br.com.potential.hotel.dto.responses.PageResponseDto;
import br.com.potential.hotel.interfaces.ExtraChargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/extracharges")
public class ExtraChargesController {

    @Autowired
    private ExtraChargesService extraChargesService;

    @GetMapping
    public PageResponseDto<ExtraChargesResponse> findAll(@PageableDefault(size = 10) Pageable pagination) {
        return extraChargesService.findAll(pagination);
    }

    @PostMapping
    public ExtraChargesResponse save(@RequestBody ExtraChargesRequest request){
        return extraChargesService.save(request);
    }
}
