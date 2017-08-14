package SchoolPicker.Services;

import SchoolPicker.Domain.School;

/**
 * Created by Kino on 2017-08-14.
 */
public interface SchoolService
{
    School create(School school);
    School read(String id);
    School update(School school);
    void delete (String id);
}
