package edu.icet.guitarmanage.controller;

import edu.icet.guitarmanage.model.Guitar;
import edu.icet.guitarmanage.service.GuitarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class GuitarController {

    @Autowired
    GuitarService  guitarService;

    @PostMapping("/guitar")
    Guitar persist(@RequestBody Guitar guitar){

        return guitarService.persist(guitar);
    }

    @GetMapping("/guitar")
    List<Guitar> retrive(){
        return guitarService.retrive();
    }
}
