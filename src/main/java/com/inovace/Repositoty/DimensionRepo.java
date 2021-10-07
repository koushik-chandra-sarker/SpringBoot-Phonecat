package com.inovace.Repositoty;

import com.inovace.Entity.PhoneDetails.Dimension;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DimensionRepo extends JpaRepository<Dimension, Integer> {
}
