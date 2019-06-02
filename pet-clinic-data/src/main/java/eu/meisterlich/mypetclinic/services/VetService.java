package eu.meisterlich.mypetclinic.services;

import eu.meisterlich.mypetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    void save(Vet vet);

    Set<Vet> findAll();
}
