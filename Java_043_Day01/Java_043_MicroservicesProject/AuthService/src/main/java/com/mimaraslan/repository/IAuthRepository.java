package com.mimaraslan.repository;

import com.mimaraslan.model.Auth;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IAuthRepository extends JpaRepository<Auth,Long> {

    Boolean existsByUsername(String username);

    Optional <Auth> findOptionalByUsernameAndPassword (String username,String password);

}
