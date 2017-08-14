package SchoolPicker.Services;

import SchoolPicker.Domain.SchoolLocation;

/**
 * Created by Kino on 2017-08-14.
 */
public interface SchoolLocationService
{

    SchoolLocation create(SchoolLocation schoolLocation);
    SchoolLocation read(String id);
    SchoolLocation update(SchoolLocation schoolLocation);
    void delete (String id);

}
