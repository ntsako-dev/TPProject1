package SchoolPicker.repositories;

import SchoolPicker.Domain.Subject;

/**
 * Created by Kino on 2017-08-13.
 */
public interface SubjectRepository
{
    Subject create(Subject subject);

    Subject read(String id);

    Subject update(Subject subject);

    void delete(String id);

}
