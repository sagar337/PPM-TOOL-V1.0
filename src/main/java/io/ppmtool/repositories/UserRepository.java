package io.ppmtool.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.ppmtool.domain.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {


    User findByUsername(String username);
    User getById(Long id);
}
