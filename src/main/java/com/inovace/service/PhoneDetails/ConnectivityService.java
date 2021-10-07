package com.inovace.service.PhoneDetails;

import com.inovace.Entity.PhoneDetails.Connectivity;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.ConnectivityRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ConnectivityService implements SCHelper<Connectivity, Integer> {
    @Autowired
    private ConnectivityRepo repo;
    @Override
    public Optional<Connectivity> retrieve(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Connectivity> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(Connectivity connectivity) {
        try {
            repo.save(connectivity);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(Connectivity connectivity) {
        repo.save(connectivity);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}