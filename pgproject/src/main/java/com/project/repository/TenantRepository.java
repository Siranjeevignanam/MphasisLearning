package com.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.model.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Long>{

	List<Tenant> findTenantByPg_pgId(Long pgid);
}
