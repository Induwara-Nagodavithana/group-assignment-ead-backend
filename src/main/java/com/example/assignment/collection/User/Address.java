package com.example.assignment.collection.User;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
    private String Street1;
    private String Street2;
    private String Town;
    private String City;
    private Integer PostalCode;

}