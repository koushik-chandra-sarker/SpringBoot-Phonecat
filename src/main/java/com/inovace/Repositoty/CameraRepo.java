package com.inovace.Repositoty;

import com.inovace.Entity.PhoneDetails.Camera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CameraRepo extends JpaRepository<Camera, Integer> {
}
