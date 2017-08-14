package SchoolPicker.repositories.Impl;

import SchoolPicker.Domain.SchoolRepresentative;
import SchoolPicker.repositories.SchoolRepresentativeRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kino on 2017-08-14.
 */
public class SchoolRepresentativeRepositoryImpl implements SchoolRepresentativeRepository
{
    private static SchoolRepresentativeRepositoryImpl respository = null;

    private Map<String,SchoolRepresentative> schoolRepTable;

    private SchoolRepresentativeRepositoryImpl() {
        schoolRepTable = new HashMap<String, SchoolRepresentative>();
    }

    public static SchoolRepresentativeRepositoryImpl getInstance(){
        if(respository==null)
            respository = new SchoolRepresentativeRepositoryImpl();
        return respository;
    }

    public SchoolRepresentative create(SchoolRepresentative schoolRepresentative) {
        schoolRepTable.put(schoolRepresentative.getRepid(),schoolRepresentative);
        SchoolRepresentative savedRep = schoolRepTable.get(schoolRepresentative.getRepid());
        return savedRep;
    }

    public SchoolRepresentative read(String id) {
        SchoolRepresentative person = schoolRepTable.get(id);
        return person;
    }

    public SchoolRepresentative update(SchoolRepresentative schoolRepresentative) {
        schoolRepTable.put(schoolRepresentative.getRepid(),schoolRepresentative);
        SchoolRepresentative savedRep = schoolRepTable.get(schoolRepresentative.getRepid());
        return savedRep;
    }

    public void delete(String id) {
        schoolRepTable.remove(id);

    }

}
