package SchoolPicker.Factories;



import SchoolPicker.Domain.School;

import java.util.Map;

/**
 * Created by Kino on 2017-08-14.
 */
public class SchoolFactory
{
    public static School getSchool(Map<String, String> values, String IDno){
        School school = new School.Builder()
                .schoolid(IDno)
                .schoolType(values.get("schoolType"))
                .country(values.get("country"))
                .province(values.get("province"))
                .contact(values.get("conect"))
                .email(values.get("email"))
                .gradeOffered(values.get("gradeoffered"))
                .build();
        return school;

    }
}
