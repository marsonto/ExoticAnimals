package data.access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
public class DataController {

    private final DataService dataService;

    @Autowired
    public DataController(final DataService dataService){
        this.dataService = dataService;
    }

    @RequestMapping("/shop/{id}")
    public Optional<Animal> getAnimal(@PathVariable("id") int id){
        return dataService.getById(id);
    }
}
