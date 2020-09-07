package by.grickevich.web;

import by.grickevich.models.Passport;
import by.grickevich.IPassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/ind")
public class Controller {

    @Autowired
    private IPassportRepository repo;

    @GetMapping
    public Passport getPassportById(@RequestParam Long id) {
        return repo.getPassportById(id);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public Passport createPassport (@RequestBody Passport passport) {
        return repo.createPassport(passport);
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public List<Passport> getAllPassport(){
        return repo.getAllPassport();
    }
    
}
