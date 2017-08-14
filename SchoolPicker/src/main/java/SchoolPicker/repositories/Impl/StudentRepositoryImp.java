package SchoolPicker.repositories.Impl;

import SchoolPicker.Domain.Student;
import SchoolPicker.repositories.StudentRepository;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Kino on 2017-08-13.
 */
public class StudentRepositoryImp implements StudentRepository
{
    private static StudentRepositoryImp respository = null;

    private Map<String,Student> studentTable;

    private StudentRepositoryImp() {
        studentTable = new HashMap<String, Student>();
    }

    public static StudentRepositoryImp getInstance(){
        if(respository==null)
            respository = new StudentRepositoryImp();
        return respository;
    }

    public Student create(Student student) {
        studentTable.put(student.getStudenID(),student);
        Student savedStudent = studentTable.get(student.getStudenID());
        return savedStudent;
    }

    public Student read(String id) {
        Student student = studentTable.get(id);
        return student;
    }

    public Student update(Student student) {
        studentTable.put(student.getStudenID(),student);
        Student savedStudent = studentTable.get(student.getStudenID());
        return savedStudent;
    }

    public void delete(String id) {
        studentTable.remove(id);

    }


}
