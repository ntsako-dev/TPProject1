package SchoolPicker.Services.Impl;

import SchoolPicker.Domain.SchoolRepresentative;
import SchoolPicker.repositories.Impl.SchoolRepresentativeRepositoryImpl;
import SchoolPicker.repositories.SchoolRepresentativeRepository;

/**
 * Created by Kino on 2017-08-14.
 */
public class SchoolRepresentativeServiceImpl
{

    private static SchoolRepresentativeServiceImpl service = null;

    SchoolRepresentativeRepository repository = SchoolRepresentativeRepositoryImpl.getInstance();

    public static SchoolRepresentativeServiceImpl getInstance(){
        if(service == null)
            service = new SchoolRepresentativeServiceImpl();
        return service;
    }

    public SchoolRepresentative create(SchoolRepresentative schoolRepresentative) {
        return repository.create(schoolRepresentative);
    }

    public SchoolRepresentative read(String id) {
        return repository.read(id);
    }

    public SchoolRepresentative update(SchoolRepresentative schoolRepresentative) {
        return repository.update(schoolRepresentative);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
