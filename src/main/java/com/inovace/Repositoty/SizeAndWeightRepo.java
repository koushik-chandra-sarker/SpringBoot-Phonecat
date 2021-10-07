package com.inovace.Repositoty;

import com.inovace.Entity.PhoneDetails.SizeAndWeight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SizeAndWeightRepo extends JpaRepository<SizeAndWeight, Integer> {
}
