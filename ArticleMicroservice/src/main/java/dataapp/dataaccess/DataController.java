package dataapp.dataaccess;

import dataapp.pojo.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/")
public class DataController {

    private final DataService dataService;

    @Autowired
    public DataController(final DataService dataService){
        this.dataService = dataService;
    }

    @PostMapping(path = "shop", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Optional<Animal> getAnimal(@RequestBody String id){
        return dataService.getById(id);
    }

    //Just for testing
    @GetMapping(path = "shop/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Optional<Animal> getAnimalTest(@PathVariable ("id") String id){
        return dataService.getById(id);
    }
}
