package SchoolPicker.repositories;

import SchoolPicker.Domain.SchoolRepresentative;

/**
 * Created by Kino on 2017-08-14.
 */
public interface SchoolRepresentativeRepository
{
    SchoolRepresentative create(SchoolRepresentative schoolRepresentative);

    SchoolRepresentative read(String id);

    SchoolRepresentative update(SchoolRepresentative schoolRepresentative);

    void delete(String id);

}
