package SchoolPicker.Services;

import SchoolPicker.Domain.Subject;

/**
 * Created by Kino on 2017-08-14.
 */
public interface SubjectService
{
    Subject create(Subject subject);
    Subject read(String id);
    Subject update(Subject subject);
    void delete (String id);
}
