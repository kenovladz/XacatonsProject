package com.example.demo.repositories;

import com.example.demo.Models.TestModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepo extends CrudRepository<TestModel, Long> {
    List<TestModel> findAllByIfCheck(boolean ifCheck);
}
