package com.example.speedwayspring2.controllers;

import com.example.speedwayspring2.domain.InventoryTag;
import com.example.speedwayspring2.service.TagServices;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(TagController.BASE_URL)
@CrossOrigin
public class TagController {

    public static final String BASE_URL = "/api/v1/tags";

    private final TagServices tagServices;


    public TagController(TagServices tagServices) {
        this.tagServices = tagServices;
    }

    @GetMapping
    List<InventoryTag> getAllTags() {
        return tagServices.findAllTag();
    }

    @GetMapping("/{id}")
    public InventoryTag getTagByID(@PathVariable Long id) {
        return tagServices.findTagByID(id);
    }

}
