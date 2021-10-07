package com.inovace.service.PhoneDetails;

import com.inovace.Entity.PhoneDetails.Dimension;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.DimensionRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DimensionService implements SCHelper<Dimension, Integer> {

    @Autowired
    private DimensionRepo repo;
    @Override
    public Optional<Dimension> retrieve(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Dimension> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(Dimension dimension) {
        try {
            repo.save(dimension);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(Dimension dimension) {
        repo.save(dimension);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
