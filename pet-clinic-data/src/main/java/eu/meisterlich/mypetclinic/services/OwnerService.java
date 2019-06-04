package eu.meisterlich.mypetclinic.services;

import eu.meisterlich.mypetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
