package eu.meisterlich.mypetclinic.bootstrap;

import eu.meisterlich.mypetclinic.model.Owner;
import eu.meisterlich.mypetclinic.model.Vet;
import eu.meisterlich.mypetclinic.services.OwnerService;
import eu.meisterlich.mypetclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired // implied
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Edwin");
        owner1.setLastName("Edwards");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Ewald");
        owner2.setLastName("Ewings");
        ownerService.save(owner2);


        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("Ernst");
        owner3.setLastName("Erlington");
        ownerService.save(owner3);

        System.out.println("Generated Owners...");

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("Elvis");
        vet1.setLastName("Eaton");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Ester");
        vet2.setLastName("Errington");
        vetService.save(vet2);

        System.out.println("Generated Vets...");


    }
}
