package com.inovace.Repositoty;

import com.inovace.Entity.PhoneDetails.Android;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AndroidRepo extends JpaRepository<Android, Integer> {
}
