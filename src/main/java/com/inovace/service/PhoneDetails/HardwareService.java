package com.inovace.service.PhoneDetails;

import com.inovace.Entity.PhoneDetails.Hardware;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.HardwareRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class HardwareService implements SCHelper<Hardware, Integer> {
    @Autowired
    private HardwareRepo repo;
    @Override
    public Optional<Hardware> retrieve(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Hardware> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(Hardware hardware) {
        try {
            repo.save(hardware);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(Hardware hardware) {
        repo.save(hardware);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
