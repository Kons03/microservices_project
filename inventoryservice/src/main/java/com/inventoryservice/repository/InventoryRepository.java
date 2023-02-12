package com.inventoryservice.repository;

import com.inventoryservice.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

    @Query("SELECT DISTINCT i.id FROM Inventory i")
    Optional<Inventory> findBySkuCode();
}
