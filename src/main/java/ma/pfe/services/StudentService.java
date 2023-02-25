package ma.pfe.services;

import ma.pfe.dtos.StudentDto;

import java.util.List;

public interface StudentService {
    Long create(StudentDto dto);
    boolean update(StudentDto dto);
    boolean delete(Long id);
    List<StudentDto> readAll();
}
