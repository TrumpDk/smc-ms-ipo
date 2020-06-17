package com.ibm.fsd.smc.ms.ipo.service;

import com.ibm.fsd.smc.ms.ipo.domain.IPOEntity;

import java.util.List;

/**
 * IPO Service
 */
public interface IPOService {

    List<IPOEntity> findAll();

    void save(IPOEntity user);

    void save(List<IPOEntity> list);

    IPOEntity findById(Integer id);

    void deleteById(Integer id);
}
