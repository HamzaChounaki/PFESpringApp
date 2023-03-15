package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final static Logger LOG = LoggerFactory.getLogger(StudentController.class);
    private StudentService studentService;

    public StudentController(@Qualifier("service1") StudentService studentService) {
        this.studentService = studentService;
    }

    /*@PostMapping("/save")
    public Long create(@RequestBody StudentDto dto){
        //return service.create(dto);
        LOG.debug("start Create");
        long result = service.create(dto);
        LOG.debug("end Create");
        return result;
    }

    @PutMapping
    public boolean update(@RequestBody StudentDto dto){
        //return service.update(dto);
        LOG.debug("start Update");
        boolean result = service.update(dto);
        LOG.debug("end Update");
        return result;
    }

    @DeleteMapping
    public boolean delete(@PathVariable("id") long id){
        //return service.delete(id);
        LOG.debug("start Delete");
        boolean result = service.delete(id);
        LOG.debug("end Delete");
        return result;
    }

    @GetMapping
    public List<StudentDto> readAll(){
        //return service.readAll();
        LOG.debug("start ReadAll");
        List<StudentDto> result = service.readAll();
        LOG.debug("end ReadAll");
        return result;
    }



    /*public Long create(StudentDto dto) {
        return service.create(dto);
    }

    public boolean update(StudentDto dto) {
        return service.update(dto);
    }

    public boolean delete(Long id) {
        return service.delete(id);
    }

    public List<StudentDto> readAll() {
        return service.readAll();
    }*/

    @PostMapping
    public Long save(@RequestBody StudentDto dto) {
        LOG.debug("start method save dto : {} ",dto);
        return studentService.save(dto);
    }

    @PutMapping
    public Long update(@RequestBody StudentDto dto) {
        LOG.debug("start method update dto : {} ",dto);
        return studentService.update(dto);
    }

    @DeleteMapping("/{ids}")
    public Boolean delete(@PathVariable("ids") Long id) {
        LOG.debug("start method delete id : {} ",id);
        return studentService.delete(id);
    }

    @GetMapping
    public List<StudentDto> selectAll() {
        LOG.debug("start method select All");
        return studentService.selectAll();
    }
}
