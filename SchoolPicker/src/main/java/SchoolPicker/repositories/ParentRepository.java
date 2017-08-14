package SchoolPicker.repositories;

import SchoolPicker.Domain.Parent;
/**
 * Created by Kino on 2017-08-13.
 */
public interface ParentRepository
{
    Parent create(Parent parent);

    Parent read(String IDno);

    Parent update(Parent parent);

    void delete(String id);

}
