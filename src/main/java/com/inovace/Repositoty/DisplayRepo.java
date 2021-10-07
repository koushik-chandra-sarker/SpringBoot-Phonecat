package com.inovace.Repositoty;

import com.inovace.Entity.PhoneDetails.Display;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisplayRepo extends JpaRepository<Display, Integer> {
}
