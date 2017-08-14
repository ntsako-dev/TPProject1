package SchoolPicker.Services.Impl;

import SchoolPicker.Domain.Student;
import SchoolPicker.repositories.Impl.StudentRepositoryImp;
import SchoolPicker.repositories.StudentRepository;

/**
 * Created by Kino on 2017-08-14.
 */
public class StudentServiceImpl
{

    private static StudentServiceImpl service = null;

    StudentRepository repository = StudentRepositoryImp.getInstance();

    public static StudentServiceImpl getInstance(){
        if(service == null)
            service = new StudentServiceImpl();
        return service;
    }

    public Student create(Student student) {
        return repository.create(student);
    }

    public Student read(String id) {
        return repository.read(id);
    }

    public Student update(Student student) {
        return repository.update(student);
    }

    public void delete(String id) {
        repository.delete(id);

    }
}
