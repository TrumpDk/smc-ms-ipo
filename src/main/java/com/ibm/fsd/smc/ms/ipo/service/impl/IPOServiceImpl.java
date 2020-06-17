package com.ibm.fsd.smc.ms.ipo.service.impl;

import com.ibm.fsd.smc.ms.ipo.domain.IPOEntity;
import com.ibm.fsd.smc.ms.ipo.repository.IPORepository;
import com.ibm.fsd.smc.ms.ipo.service.IPOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * IPO Service Implement Class
 */
@Service
public class IPOServiceImpl implements IPOService {

    @Autowired
    private IPORepository ipoRepo;

    @Override
    public List<IPOEntity> findAll() {
        return ipoRepo.findAll();
    }

    @Override
    public void save(IPOEntity stockExchange) {
        ipoRepo.save(stockExchange);
    }

    @Override
    public IPOEntity findById(Integer id) {
         Optional<IPOEntity> result = ipoRepo.findById(id);
         if(result.isPresent()){
             return result.get();
         }else {
             return null;
         }
    }

    @Override
    public void deleteById(Integer id) {
        ipoRepo.deleteById(id);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void save(List<IPOEntity> list) {
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                /*if (i % 2 == 1) {
                    throw new RuntimeException();
                }*/
                ipoRepo.save(list.get(i));
            }
        }
    }
}
