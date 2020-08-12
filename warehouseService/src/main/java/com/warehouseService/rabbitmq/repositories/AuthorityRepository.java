package com.warehouseService.rabbitmq.repositories;


import com.warehouseService.rabbitmq.domains.Authority;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends CrudRepository<Authority,Long> {
    public Authority findByAuthority(String authority);
}