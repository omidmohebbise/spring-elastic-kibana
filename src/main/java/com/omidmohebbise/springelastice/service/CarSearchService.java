package com.omidmohebbise.springelastice.service;

import com.omidmohebbise.springelastice.model.CarModel;
import com.omidmohebbise.springelastice.repository.CarElasticRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class CarSearchService {

    private final CarElasticRepository repository;
    public void add(CarModel car) {
        repository.save(car);
    }

    public Iterable<CarModel> findAll() {
        return repository.findAll();
    }
}
