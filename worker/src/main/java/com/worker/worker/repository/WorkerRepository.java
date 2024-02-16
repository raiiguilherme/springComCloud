package com.worker.worker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worker.worker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {
    
}
