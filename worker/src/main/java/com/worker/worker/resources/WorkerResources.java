package com.worker.worker.resources;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worker.worker.entities.Worker;
import com.worker.worker.services.WorkerService;

@RestController
@RequestMapping(value = "/workers")
public class WorkerResources {

    @Autowired
    private WorkerService service;


    @GetMapping
    public ResponseEntity<List<Worker>> findAll(){

        List<Worker> lis = service.findAll();
        return ResponseEntity.ok(lis);
        
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Worker> findById(@PathVariable long id){
        Worker worker = service.findById(id);
        return ResponseEntity.ok(worker);
        
    }

    
}
