package br.com.potential.hotel.controllers;

import br.com.potential.hotel.dto.requests.ExtraChargesRequest;
import br.com.potential.hotel.dto.responses.ExtraChargesResponse;
import br.com.potential.hotel.interfaces.ExtraChargesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/extracharges")
public class ExtraChargesController {

    @Autowired
    private ExtraChargesService service;

    @PostMapping
    public ExtraChargesResponse save(@RequestBody ExtraChargesRequest request){
        return service.save(request);
    }
}
