package shoppingapp.services;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShoppingService {

    public Animal getAnimalById(String id) {
        final String uri = "http://localhost:8080/shop";
        final String plain = "dude:wow";

        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add(HttpHeaders.USER_AGENT, "Mozilla/5.0 (X11; Linux x86_64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/73.0.3683.103 Safari/537.36");
        headers.add(HttpHeaders.AUTHORIZATION, plain);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> entity = new HttpEntity<>(id, headers);
        ResponseEntity<Animal> result = restTemplate.exchange(uri, HttpMethod.POST, entity, Animal.class);

        return result.getBody();
    }
}
