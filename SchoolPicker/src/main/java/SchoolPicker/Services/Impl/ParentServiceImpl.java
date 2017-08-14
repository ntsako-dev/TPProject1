package SchoolPicker.Services.Impl;

import SchoolPicker.Domain.Parent;
import SchoolPicker.repositories.ParentRepository;

/**
 * Created by Kino on 2017-08-14.
 */
public class ParentServiceImpl
{
    private static ParentServiceImpl service = null;

    ParentRepository repository = (ParentRepository) ParentServiceImpl.getInstance();

    public static ParentServiceImpl getInstance(){
        if(service == null)
            service = new ParentServiceImpl();
        return service;
    }

    public Parent create(Parent parent) {
        return repository.create(parent);
    }

    public Parent read(String id) {
        return repository.read(id);
    }

    public Parent update(Parent parent) {
        return repository.update(parent);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
