package com.bibliotheque.motosapi.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class AuthentificationResponse {
    private final String jwt;
}
