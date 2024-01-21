/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */
package com.auth.auth.modules.Auth.Domain.exception;

import java.nio.file.AccessDeniedException;

public class AuthorizationException extends AccessDeniedException {
    public AuthorizationException(String message) {
        super(message);
    }
}
