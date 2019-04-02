package dataaccess;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping(path = "/")
public class DataController {

    private final DataService dataService;

    @Autowired
    public DataController(final DataService dataService){
        this.dataService = dataService;
    }

    @GetMapping(path = "shop/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Optional<Animal> getAnimal(@PathVariable("id") int id){
        return dataService.getById(id);
    }
}
