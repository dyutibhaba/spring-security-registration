package com.bb.persistence.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bb.persistence.model.Privilege;

public interface PrivilegeRepository extends JpaRepository<Privilege, Long> {

    Privilege findByName(String name);

    @Override
    void delete(Privilege privilege);

}
