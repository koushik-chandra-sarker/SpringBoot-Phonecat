package com.inovace.Repositoty;

import com.inovace.Entity.PhoneDetails.Feature;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRepo extends JpaRepository<Feature, Integer> {
}
