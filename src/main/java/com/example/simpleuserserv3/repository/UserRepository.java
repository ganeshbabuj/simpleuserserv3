package com.example.simpleuserserv3.repository;

import com.example.simpleuserserv3.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends PagingAndSortingRepository<UserEntity, Long> {


    boolean existsByUsername(String username);

    Page<UserEntity> findByFirstName(String firstName, Pageable pageable);


}
