package com.inovace.service.PhoneDetails;

import com.inovace.Entity.PhoneDetails.Image;
import com.inovace.Exception.MyMadeException;
import com.inovace.Repositoty.ImageRepo;
import com.inovace.Utils.SCHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ImageService implements SCHelper<Image, Integer> {
    @Autowired
    private ImageRepo repo;
    @Override
    public Optional<Image> retrieve(Integer id) {
        return repo.findById(id);
    }

    @Override
    public List<Image> retrieveALL() {
        return repo.findAll();
    }

    @Override
    public void store(Image image) {
        try {
            repo.save(image);
        } catch (Exception e) {
            throw new MyMadeException(e.getMessage());
        }
    }

    @Override
    public void update(Image image) {
       repo.save(image);
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
