package SchoolPicker.Services;

import SchoolPicker.Domain.Parent;
import SchoolPicker.Domain.School;

/**
 * Created by Kino on 2017-08-14.
 */
public interface ParentService
{
    Parent create(Parent parent);
    Parent read(String id);
    Parent update(Parent parent);
    void delete (String id);
}
