package com.example.DGStoer.domain.item.repository;

import com.example.DGStoer.domain.item.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
