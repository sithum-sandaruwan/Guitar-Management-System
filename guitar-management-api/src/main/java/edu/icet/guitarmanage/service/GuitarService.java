package edu.icet.guitarmanage.service;

import edu.icet.guitarmanage.model.Guitar;

import java.util.List;

public interface GuitarService {

    public Guitar  persist(Guitar guitar);
    List<Guitar> retrive();
}
