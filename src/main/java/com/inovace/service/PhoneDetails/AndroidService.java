package com.inovace.service.PhoneDetails;

import com.inovace.Entity.PhoneDetails.Android;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.AndroidRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AndroidService implements SCHelper<Android, Integer> {
    @Autowired
    private AndroidRepo repo;
    @Override
    public Optional<Android> retrieve(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Android> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(Android android) {
        try {
            repo.save(android);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(Android android) {
        repo.save(android);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
