package com.example.speedwayspring2.service;

import com.example.speedwayspring2.domain.InventoryTag;
import com.example.speedwayspring2.repository.TagRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TagServiceImplementation implements TagServices {

    private final TagRepo TagRepo;

    public TagServiceImplementation(TagRepo tagRepo) {
        this.TagRepo = tagRepo;
    }

    @Override
    public InventoryTag findTagByID(Long id) {
        return TagRepo.findById(id).get();
    }

    //to be continued
    @Override
    public InventoryTag findTagByEPC(String EPC) {
        return null;
    }

    @Override
    public List<InventoryTag> findAllTag() {
        return TagRepo.findAll();
    }
}
