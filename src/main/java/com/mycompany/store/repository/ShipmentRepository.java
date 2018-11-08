package com.mycompany.store.repository;

import com.mycompany.store.domain.Shipment;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


/**
 * Spring Data  repository for the Shipment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {
    Page<Shipment> findAllByInvoiceOrderCustomerUserLogin(String login, Pageable pageable);

    Shipment findOneByIdAndInvoiceOrderCustomerUserLogin(Long id, String login);
}
