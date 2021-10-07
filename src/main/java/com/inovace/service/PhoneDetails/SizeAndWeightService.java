package com.inovace.service.PhoneDetails;

import com.inovace.Entity.PhoneDetails.SizeAndWeight;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.SizeAndWeightRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class SizeAndWeightService implements SCHelper<SizeAndWeight, Integer> {
    @Autowired
    private SizeAndWeightRepo repo;
    @Override
    public Optional<SizeAndWeight> retrieve(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<SizeAndWeight> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(SizeAndWeight sizeAndWeight) {
        try {
            repo.save(sizeAndWeight);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(SizeAndWeight sizeAndWeight) {
        repo.save(sizeAndWeight);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
