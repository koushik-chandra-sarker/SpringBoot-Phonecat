package com.inovace.Repositoty;

import com.inovace.Entity.PhoneDetails.Availability;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvailabilityRepo extends JpaRepository<Availability, Integer> {
}
