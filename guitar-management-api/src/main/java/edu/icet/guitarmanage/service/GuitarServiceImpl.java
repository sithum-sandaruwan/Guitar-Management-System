package edu.icet.guitarmanage.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.icet.guitarmanage.entity.GuitarEntity;
import edu.icet.guitarmanage.model.Guitar;
import edu.icet.guitarmanage.repository.GuitarRepository;
import org.apache.catalina.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GuitarServiceImpl implements GuitarService {

    @Autowired
    GuitarRepository repository;

    @Autowired
    ObjectMapper mapper;
    public Guitar persist(Guitar guitar){

        GuitarEntity savedProduct = repository.save(
                mapper.convertValue(
                        guitar, GuitarEntity.class));

        return mapper.convertValue(savedProduct, Guitar.class);
    }

    public List<Guitar> retrive(){

        Iterable<GuitarEntity> guitarList = repository.findAll();

        List<Guitar> guitarModels = new ArrayList<>();

        guitarList.forEach(guitarEntity -> {
           guitarModels.add(
                   mapper.convertValue(guitarEntity,Guitar.class));
        });

        return guitarModels;
    }
}
