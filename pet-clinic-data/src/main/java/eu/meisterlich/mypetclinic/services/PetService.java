package eu.meisterlich.mypetclinic.services;

import eu.meisterlich.mypetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    void save(Pet pet);

    Set<Pet> findAll();
}
