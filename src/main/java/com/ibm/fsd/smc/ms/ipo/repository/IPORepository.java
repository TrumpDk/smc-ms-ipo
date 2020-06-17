package com.ibm.fsd.smc.ms.ipo.repository;

import com.ibm.fsd.smc.ms.ipo.domain.IPOEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * IPO Repository
 */
public interface IPORepository extends JpaRepository<IPOEntity, Integer> {
}
