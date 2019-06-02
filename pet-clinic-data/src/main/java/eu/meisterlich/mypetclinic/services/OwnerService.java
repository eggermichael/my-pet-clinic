package eu.meisterlich.mypetclinic.services;

import eu.meisterlich.mypetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findById(Long id);

    void save(Owner owner);

    Set<Owner> findAll();
}
