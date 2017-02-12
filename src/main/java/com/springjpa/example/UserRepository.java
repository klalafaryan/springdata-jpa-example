package com.springjpa.example;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    /**
     *
     * @param id the user id
     * @return the User entity for specified id
     */
    User findById(final Long id);

}
