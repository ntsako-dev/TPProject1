package SchoolPicker.Services;

import SchoolPicker.Domain.Student;

/**
 * Created by Kino on 2017-08-14.
 */
public interface StudentService
{
    Student create(Student student);
    Student read(String id);
    Student update(Student student);
    void delete (String id);
}
