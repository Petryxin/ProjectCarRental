package by.grickevich;

import by.grickevich.models.Passport;

import java.util.List;

public interface IPassportRepository {
    Passport getPassportById(Long id);

    Passport createPassport(Passport passport);

    List<Passport> getAllPassport();



}
