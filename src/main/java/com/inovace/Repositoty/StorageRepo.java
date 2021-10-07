package com.inovace.Repositoty;

import com.inovace.Entity.PhoneDetails.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepo extends JpaRepository<Storage, Integer> {
}
