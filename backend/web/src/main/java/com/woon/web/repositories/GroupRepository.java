package com.woon.web.repositories;

import com.woon.web.entities.Group;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * GroupRepository
 */
@Repository
public interface GroupRepository extends CrudRepository<Group, Long> {

    
}