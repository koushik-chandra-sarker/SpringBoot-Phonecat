package com.inovace.Repositoty;

import com.inovace.Entity.PhoneDetails.Battery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BatteryRepo extends JpaRepository<Battery, Integer> {
}
