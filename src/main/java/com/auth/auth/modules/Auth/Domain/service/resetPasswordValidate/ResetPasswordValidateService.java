/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */
package com.auth.auth.modules.Auth.Domain.service.resetPasswordValidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.auth.modules.Auth.Application.DTOs.token.TokenResetPasswordDTO;
import com.auth.auth.modules.Auth.Domain.provider.resetPassword.CodeExpiration;

@Service
public class ResetPasswordValidateService {

  private CodeExpiration codeExpiration;

  @Autowired
  public ResetPasswordValidateService(CodeExpiration codeExpiration) {
    this.codeExpiration = codeExpiration;
  }

  public boolean validateToken(TokenResetPasswordDTO tokenResetPasswordDTO) {
    return codeExpiration.isCodeExpired(
      tokenResetPasswordDTO.getTokenPassword()
    );
  }
}
