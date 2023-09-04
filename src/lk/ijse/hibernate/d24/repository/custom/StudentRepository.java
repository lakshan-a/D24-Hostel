package lk.ijse.hibernate.d24.repository.custom;

import lk.ijse.hibernate.d24.entity.StudentEntity;
import lk.ijse.hibernate.d24.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity> {
    public String findNextStudentID();
}
