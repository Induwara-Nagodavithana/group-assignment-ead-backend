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
    private String firstName;
    private String middleName;
    private String lastName;
    private LocalDate birthday;
    private String NIC;
    @NonNull
    private String email;
    @NonNull
    private String password;
    @NonNull
    private Role role;


}

