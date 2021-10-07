package com.inovace.service;

import com.inovace.Entity.PhoneDetail;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.PhoneDetailRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PhoneDetailService implements SCHelper<PhoneDetail,String> {

    @Autowired
    private PhoneDetailRepo repo;

    @Override
    public Optional<PhoneDetail> retrieve(String id) {
        return repo.findById(id);
    }

    @Override
    public List<PhoneDetail> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(PhoneDetail phoneDetail) {
        try {
            repo.save(phoneDetail);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(PhoneDetail phoneDetail) {
        repo.save(phoneDetail);
    }

    @Override
    public void delete(String id) {
        repo.deleteById(id);
    }
}
