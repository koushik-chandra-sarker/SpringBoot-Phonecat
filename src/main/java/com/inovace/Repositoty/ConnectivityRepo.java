package com.inovace.Repositoty;

import com.inovace.Entity.PhoneDetails.Connectivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConnectivityRepo extends JpaRepository<Connectivity, Integer> {
}
