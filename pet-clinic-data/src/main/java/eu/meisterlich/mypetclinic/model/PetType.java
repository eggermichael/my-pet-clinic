package eu.meisterlich.mypetclinic.model;

public class PetType extends BaseEntity {

    private String petType;

    public PetType(String petType) {
        this.petType = petType;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }
}
