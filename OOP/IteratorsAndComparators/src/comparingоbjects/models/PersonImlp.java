package comparingоbjects.models;

import comparingоbjects.interfaces.Person;

public class PersonImlp implements Person{

    private String personName;
    private Integer personAge;
    private String personTown;

    public PersonImlp(String personName, Integer personAge) {
        this.personName = personName;
        this.personAge = personAge;
        this.personTown = personTown;
    }

    @Override
    public String getName() {
        return this.personName;
    }

    @Override
    public Integer getAge() {
        return this.personAge;
    }

    @Override
    public String getTown() {
        return this.personTown;
    }

    private void setPersonName(String personName) {
        this.personName = personName;
    }

    private void setPersonAge(Integer personAge) {
        this.personAge = personAge;
    }

    private void setPersonTown(String personTown) {
        this.personTown = personTown;
    }

    @Override
    public int compareTo(Person otherPerson) {
        int compareByNames = this.getName().compareTo(otherPerson.getName());
        int compareByAge = this.getAge().compareTo(otherPerson.getAge());
        int compareByTown = this.getTown().compareTo(otherPerson.getTown());

        if (compareByNames==0 && compareByAge==0 && compareByTown==0){
            return 0;
        }
        return 1;
    }
}
