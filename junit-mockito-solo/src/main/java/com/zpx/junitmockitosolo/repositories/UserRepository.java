package com.zpx.junitmockitosolo.repositories;

import com.zpx.junitmockitosolo.domains.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
}
