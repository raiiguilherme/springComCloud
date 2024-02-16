package com.worker.worker.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.worker.worker.entities.Worker;
import com.worker.worker.repository.WorkerRepository;

@Service
public class WorkerService {

@Autowired
private WorkerRepository repository;

public List<Worker> findAll(){

    List<Worker> lis = repository.findAll();
    return lis;


}

public Worker findById(long id){
    Optional<Worker> op = repository.findById(id);
   
    return op.get();

     

}


    
}
