package com.example.speedwayspring2.service;

import com.example.speedwayspring2.domain.InventoryTag;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TagServices {

    InventoryTag findTagByID(Long ID);
    InventoryTag findTagByEPC(String EPC);
    List<InventoryTag> findAllTag();


}
