package com.inovace.service.PhoneDetails;

import com.inovace.Entity.PhoneDetails.Camera;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.CameraRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CameraService implements SCHelper<Camera, Integer> {
    @Autowired
    private CameraRepo repo;
    @Override
    public Optional<Camera> retrieve(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Camera> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(Camera camera) {
        try {
            repo.save(camera);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(Camera camera) {
        repo.save(camera);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
