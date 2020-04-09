package com.example.speedwayspring2.repository;

import com.example.speedwayspring2.domain.InventoryTag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepo extends JpaRepository<InventoryTag, Long> {
}
