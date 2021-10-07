package com.inovace.Controller;

import com.inovace.Entity.Phone;
import com.inovace.Utils.SCHelper;
import com.inovace.service.PhoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/phone")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PhoneController implements SCHelper<Phone, String> {

    @Autowired
    private PhoneService service;
    @Override
    @GetMapping("{id}")
    public Optional<Phone> retrieve(@PathVariable String id) {
        return service.retrieve(id);
    }

    @Override
    @GetMapping
    public List<Phone> retrieveALL() {
        return service.retrieveALL();
    }

    @Override
    @PostMapping("/add")
    public void store(@RequestBody Phone phone) {
        service.store(phone);
    }

    @Override
    @PutMapping
    public void update(@RequestBody Phone phone) {
        service.update(phone);
    }

    @Override
    @DeleteMapping("{id}")
    public void delete(@PathVariable String id) {
        service.delete(id);
    }
}
