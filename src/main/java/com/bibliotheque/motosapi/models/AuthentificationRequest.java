package com.bibliotheque.motosapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AuthentificationRequest {
    private String username;
    private String password;
}
