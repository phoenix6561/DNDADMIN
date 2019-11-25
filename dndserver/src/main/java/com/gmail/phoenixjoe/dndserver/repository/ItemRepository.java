package com.gmail.phoenixjoe.dndserver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gmail.phoenixjoe.dndserver.model.Item;



@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    

}
