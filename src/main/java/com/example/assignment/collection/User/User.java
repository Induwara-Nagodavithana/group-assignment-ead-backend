package com.example.assignment.collection.User;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import lombok.NonNull;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data  //getters setters
@Builder
@Document(collection = "user")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User {
    @Id
    private String userId;

//    personal info
    private title title;
    private gender gender;
    private String lastName;
    private String initials;
    private String fullName;
    private String otherName;
    private String NIC;
    private String passportNo;
    private LocalDate birthday;
    private status status;
    private Integer noDependents;

//    contact info
    private String address;
    private Integer postalCode;
    private String phoneNumber;
    @NonNull
    private String email;

//    income info
    private String businessType;
    private String business;
    private String officialAddress;
    private LocalDate empStartDate;
    private Double MonthlyIncome;
    private Boolean isTaxPayer;

    //bank usage
    private Boolean isActivate;
    @NonNull
    private String password;
    @NonNull
    private Role role;
    private String remark;


}

