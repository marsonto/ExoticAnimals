package shoppingapp.services;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ShoppingService {

    public Animal getAnimalById(String id) {
        final String uri = "http://localhost:8080/shop";
        final String plain = "dude:wow";
        byte[] plainBytes = plain.getBytes();
        byte[] base64Bytes = Base64.encodeBase64(plainBytes);
        String base64 = new String(base64Bytes);

        final HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.add(HttpHeaders.AUTHORIZATION, "Basic " + base64);

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> entity = new HttpEntity<>(id, headers);
        ResponseEntity<Animal> result = restTemplate.exchange(uri, HttpMethod.POST, entity, Animal.class);

        return result.getBody();
    }
}
