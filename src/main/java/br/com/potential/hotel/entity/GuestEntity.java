package br.com.potential.hotel.entity;

import jakarta.persistence.Id;

public class GuestEntity {

    @Id
    private Long documentNumber;
    private String name;
    private String email;
    private String phoneNumber;
    private String address;
    private Integer age;
}
