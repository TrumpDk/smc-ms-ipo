package com.ibm.fsd.smc.ms.ipo.controller;

import com.ibm.fsd.smc.ms.ipo.domain.IPOEntity;
import com.ibm.fsd.smc.ms.ipo.service.IPOService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * IPO Controller
 */
@CrossOrigin
@RestController
//@RequestMapping("/ipo")
@Slf4j
public class IPOController {

    @Autowired
    private IPOService ipoSvc;

    @GetMapping("/ipos")
    public List<IPOEntity> findAll() {
        return ipoSvc.findAll();
    }

    @GetMapping("/{id}")
    public IPOEntity findIPO(@PathVariable("id") Integer id) {
        return ipoSvc.findById(id);
    }

    @PostMapping("/addition")
    public ResponseEntity<Boolean> addIPO(@RequestBody IPOEntity ipo){
        Boolean result = Boolean.FALSE;
        ipoSvc.save(ipo);
        result = Boolean.TRUE;
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Boolean> updateIPO(@RequestBody IPOEntity ipo){
        Boolean result = Boolean.FALSE;
        ipoSvc.save(ipo);
        result = Boolean.TRUE;
        return new ResponseEntity(result, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteIPO(@PathVariable("id") Integer id){
        Boolean result = Boolean.FALSE;
        ipoSvc.deleteById(id);
        return new ResponseEntity(result, HttpStatus.OK);
    }
}
