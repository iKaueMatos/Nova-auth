/**
 * ----------------------------------------------------------------------------
 * Autor: Kaue de Matos
 * Empresa: Nova Software
 * Propriedade da Empresa: Todos os direitos reservados
 * ----------------------------------------------------------------------------
 */
package com.auth.auth.modules.CustomerAddress.Infra.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.auth.auth.modules.CustomerAddress.Infra.persistence.entity.CustomerAddressEntity;

@Repository
public interface CustomerAddressRepository extends JpaRepository<CustomerAddressEntity, Long> { }