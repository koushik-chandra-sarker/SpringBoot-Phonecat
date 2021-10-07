package com.inovace.service.PhoneDetails;

import com.inovace.Entity.PhoneDetails.Feature;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.FeatureRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class FeatureService implements SCHelper<Feature,Integer> {
    @Autowired
    private FeatureRepo repo;

    @Override
    public Optional<Feature> retrieve(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Feature> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(Feature feature) {
        try {
            repo.save(feature);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(Feature feature) {
        repo.save(feature);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);

    }
}
