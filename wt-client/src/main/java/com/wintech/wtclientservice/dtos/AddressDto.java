package com.wintech.wtclientservice.dtos;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {

    private Long id;
    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
    private String ibge;
    private String gia;
    private String ddd;
    private String siafi;

}
