package SchoolPicker.Services.Impl;

import SchoolPicker.Domain.School;
import SchoolPicker.repositories.ParentRepository;
import SchoolPicker.repositories.SchoolRepository;

/**
 * Created by Kino on 2017-08-14.
 */
public class SchoolServiceImpl
{

    private static SchoolServiceImpl service = null;

    SchoolRepository repository = (SchoolRepository) SchoolServiceImpl.getInstance();

    public static SchoolServiceImpl getInstance(){
        if(service == null)
            service = new SchoolServiceImpl();
        return service;
    }

    public School create(School school) {
        return repository.create(school);
    }

    public School read(String id) {
        return repository.read(id);
    }

    public School update(School school) {
        return repository.update(school);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
