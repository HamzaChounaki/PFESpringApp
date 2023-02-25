package ma.pfe.repositories;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.javapoet.ClassName;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Lazy
@Component
//@RestController
//@RequestMapping("/repositories")
public class StudentRepositoryImpl implements StudentRepository{


    private StudentRepository repository;

    public StudentRepositoryImpl(StudentRepository repository) {
        this.repository = repository;
    }

    //@PostMapping("/save")
    @Override
    public Long create(StudentEntity entity) {
        LOG.debug("start Create");
        long result = repository.create(entity);
        LOG.debug("end Create");
        return result;
    }

    //@PutMapping
    @Override
    public boolean update(StudentEntity entity) {
        LOG.debug("start Create");
        boolean result = repository.update(entity);
        LOG.debug("end Create");
        return result;
    }

    //@DeleteMapping
    @Override
    public boolean delete(Long id) {
        LOG.debug("start Create");
        boolean result = repository.delete(id);
        LOG.debug("end Create");
        return result;
    }

    //@GetMapping
    @Override
    public List<StudentEntity> readAll() {
        LOG.debug("start ReadAll");
        List<StudentEntity> result = repository.readAll();
        LOG.debug("end ReadAll");
        return result;
    }

    private final static Logger LOG = LoggerFactory.getLogger(ClassName.class);
}
