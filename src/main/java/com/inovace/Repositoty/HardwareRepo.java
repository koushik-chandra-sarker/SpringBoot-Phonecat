package com.inovace.Repositoty;

import com.inovace.Entity.PhoneDetails.Hardware;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardwareRepo extends JpaRepository<Hardware, Integer> {
}
