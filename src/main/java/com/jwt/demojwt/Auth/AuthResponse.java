package com.jwt.demojwt.Auth;
//RESPUESTA INDEPENDIENTE SI ES DE REGISTER O LOGIN, DEVUELVE EL TOKEN QUE ES UNA CADENA DE CARACTERES

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Crear get y setters
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class AuthResponse {

    String token;
}
