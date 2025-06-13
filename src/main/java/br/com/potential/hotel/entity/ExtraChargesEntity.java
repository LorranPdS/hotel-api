package br.com.potential.hotel.entity;

import java.util.UUID;

public class ExtraChargesEntity {

    private UUID chargeId;
//    private ProductEntity product; // TODO: I'm going to get ProductEntity that is in supermarket-api using pom.xml
    private String product;
    private Double price;
    private Integer quantity;

}
