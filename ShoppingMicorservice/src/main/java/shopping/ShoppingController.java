package shopping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShoppingController {

    private final ShoppingService service;

    @Autowired
    public ShoppingController (final ShoppingService service) { this.service = service;}

}
