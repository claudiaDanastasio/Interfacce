package it.ibm.interfacce.domain;

public interface ProgrammerRepository {
    void saveProgrammer(Programmer p);
    Programmer findById(long id);
}
