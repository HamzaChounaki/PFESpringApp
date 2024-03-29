package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component(value = "mapper1")
public class StudentMapper {
    public StudentEntity studentDtoToEntity(StudentDto dto) {
        StudentEntity studentEntity = new StudentEntity();
        //studentEntity.setStudentId(new StudentId(dto.getId(),""));
        studentEntity.setName(dto.getName());
        return studentEntity;
    }

    public StudentDto studentEntityToDto(StudentEntity studentEntity) {
        StudentDto dto = new StudentDto();
        //dto.setId(studentEntity.getStudentId().getId());
        dto.setName(studentEntity.getName());
        return dto;
    }

    public List<StudentDto> studentEntiesToDtos(List<StudentEntity> studentEntities) {
        if(studentEntities!=null&&!studentEntities.isEmpty()){
            return studentEntities.stream().map(studentEntity -> studentEntityToDto(studentEntity)).collect(Collectors.toList());
        }else {
            return new ArrayList<>();
        }
    }
}
