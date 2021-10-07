package com.inovace.service.PhoneDetails;

import com.inovace.Entity.PhoneDetails.Storage;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.StorageRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class StorageService implements SCHelper<Storage, Integer> {
    @Autowired
    private StorageRepo repo;
    @Override
    public Optional<Storage> retrieve(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Storage> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(Storage storage) {
        try {
            repo.save(storage);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(Storage storage) {
        repo.save(storage);
    }

    @Override
    public void delete(Integer id) {
       repo.deleteById(id);
    }
}
