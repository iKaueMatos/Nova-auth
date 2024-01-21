/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */
package com.auth.auth.modules.Auth.Domain.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.auth.auth.modules.Auth.Domain.exception.LoginFailedException;

@ControllerAdvice
public class LoginFailedExceptionHandlerController {
    @ExceptionHandler(LoginFailedException.class)
    public ResponseEntity<String> handleRegistrationFailedException(LoginFailedException ex) {
        String errorMessage = ex.getMessage();
        return new ResponseEntity<>(errorMessage, HttpStatus.FORBIDDEN);
    }
}
