package shoppingapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ShoppingController {

    private final ShoppingService service;

    @Autowired
    public ShoppingController(final ShoppingService service) {
        this.service = service;
    }

    @RequestMapping("shop/{id}")
    public Animal getAnimal(@PathVariable("id") String id){
        return service.getAnimalById(id);
    }
}
