package com.inovace.service.PhoneDetails;

import com.inovace.Entity.PhoneDetails.Display;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.DisplayRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class DisplayService implements SCHelper<Display,Integer> {

    @Autowired
    private DisplayRepo repo;
    @Override
    public Optional<Display> retrieve(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Display> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(Display display) {
        try {
            repo.save(display);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(Display display) {
        repo.save(display);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
