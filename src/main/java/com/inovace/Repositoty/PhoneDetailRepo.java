package com.inovace.Repositoty;

import com.inovace.Entity.PhoneDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneDetailRepo extends JpaRepository<PhoneDetail, String> {
}
