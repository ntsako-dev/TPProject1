package SchoolPicker.Services.Impl;

import SchoolPicker.Domain.SchoolLocation;
import SchoolPicker.repositories.SchoolLocationRepository;
import SchoolPicker.repositories.SchoolRepository;

/**
 * Created by Kino on 2017-08-14.
 */
public class SchoolLocationServiceImpl
{

    private static SchoolLocationServiceImpl service = null;

    SchoolLocationRepository repository = (SchoolLocationRepository) SchoolLocationServiceImpl.getInstance();

    public static SchoolLocationServiceImpl getInstance(){
        if(service == null)
            service = new SchoolLocationServiceImpl();
        return service;
    }

    public SchoolLocation create(SchoolLocation schoolLocation) {
        return repository.create(schoolLocation);
    }

    public SchoolLocation read(String id) {
        return repository.read(id);
    }

    public SchoolLocation update(SchoolLocation schoolLocation) {
        return repository.update(schoolLocation);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
