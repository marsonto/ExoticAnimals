package shopping;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShoppingService {

    public Animal getAnimalById(String id){
        final String uri = "http://localhost:8080/shop";
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();

        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<String> entity = new HttpEntity<>(id,headers);

        ResponseEntity<Animal> result = restTemplate.exchange(uri, HttpMethod.POST, entity, Animal.class);

        return result.getBody();
    }
}
