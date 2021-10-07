package com.inovace.Controller;

import com.inovace.Entity.PhoneDetail;
import com.inovace.Utils.SCHelper;
import com.inovace.service.PhoneDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/phone-detail")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PhoneDetailController implements SCHelper<PhoneDetail, String> {
    @Autowired
    private PhoneDetailService service;

    @Override
    @GetMapping("{id}")
    public Optional<PhoneDetail> retrieve(@PathVariable String id) {
        return service.retrieve(id);
    }

    @Override
    @GetMapping
    public List<PhoneDetail> retrieveALL() {
        return service.retrieveALL();
    }

    @Override
    @PostMapping("/add")
    public void store(@RequestBody PhoneDetail phoneDetail) {
        service.store(phoneDetail);
    }

    @Override
    @PutMapping
    public void update(@RequestBody PhoneDetail phoneDetail) {
        service.update(phoneDetail);
    }

    @Override
    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
