package ma.pfe.services;

import ma.pfe.dtos.StudentDto;

import java.util.List;

public interface StudentService {
    Long save(StudentDto s);

    Long update(StudentDto s);

    Boolean delete(Long id);

    List<StudentDto> selectAll();
}
