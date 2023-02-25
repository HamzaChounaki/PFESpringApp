package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import ma.pfe.mappers.StudentMapper;
import ma.pfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.javapoet.ClassName;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentServiceImpl implements StudentService{
    /*@Autowired
    private StudentRepository repository;
    @Autowired
    private StudentMapper mapper;*/

    private StudentService service;

    public StudentServiceImpl(StudentService service) {
        this.service = service;
    }

    public StudentServiceImpl() {
        System.out.println("instance StudentServiceImpl");
    }

    @Override
    public Long create(StudentDto dto) {
        //return mapper.convertEntityToDto(repository.create(mapper.convertDtoToEntity(dto)));
        LOG.debug("start Create");
        long result = service.create(dto);
        LOG.debug("end Create");
        return result;
    }

    @Override
    public boolean update(StudentDto dto) {
        //return mapper.convertEntityToDto(repository.update(mapper.convertDtoToEntity(dto)));
        LOG.debug("start Update");
        boolean result = service.update(dto);
        LOG.debug("end Update");
        return result;
    }

    @Override
    public boolean delete(Long id) {
        //return repository.delete(id);
        LOG.debug("start Delete");
        boolean result = service.delete(id);
        LOG.debug("end Delete");
        return result;
    }

    @Override
    public List<StudentDto> readAll() {
        //return mapper.convertEntitiesToDtos(repository.readAll());
        LOG.debug("start ReadAll");
        List<StudentDto> result = service.readAll();
        LOG.debug("end ReadAll");
        return result;
    }

    private final static Logger LOG = LoggerFactory.getLogger(ClassName.class);
}
