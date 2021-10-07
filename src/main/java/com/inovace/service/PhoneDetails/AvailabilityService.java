package com.inovace.service.PhoneDetails;

import com.inovace.Entity.PhoneDetails.Availability;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.AvailabilityRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AvailabilityService implements SCHelper<Availability, Integer> {
    @Autowired
    private AvailabilityRepo repo;
    @Override
    public Optional<Availability> retrieve(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Availability> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(Availability availability) {
        try {
            repo.save(availability);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(Availability availability) {
        repo.save(availability);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
