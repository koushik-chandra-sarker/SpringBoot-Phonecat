package com.inovace.service;

import com.inovace.Entity.Phone;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.PhoneRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhoneService implements SCHelper<Phone, String> {

    @Autowired
    private PhoneRepo repo;

    @Override
    public Optional<Phone> retrieve(String id) {
        return repo.findById(id);
    }

    @Override
    public List<Phone> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(Phone phone) {
        try {
            repo.save(phone);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(Phone phone) {
        repo.save(phone);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
