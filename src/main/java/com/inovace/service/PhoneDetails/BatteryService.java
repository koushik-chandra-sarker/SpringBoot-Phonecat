package com.inovace.service.PhoneDetails;

import com.inovace.Entity.PhoneDetails.Battery;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.BatteryRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BatteryService implements SCHelper<Battery, Integer> {
    @Autowired
    private BatteryRepo repo;
    @Override
    public Optional<Battery> retrieve(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Battery> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(Battery battery) {
        try {
            repo.save(battery);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(Battery battery) {
        repo.save(battery);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
