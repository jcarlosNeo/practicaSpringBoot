package api_Items.catalogo_items.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("api/pokemons")
public class pokeApi {

    @GetMapping("{pokemonID}")
    public ResponseEntity<String> getPokemon(@PathVariable("pokemonID") String pokemonID) {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.getForEntity("https://pokeapi.co/api/v2/pokemon/" + pokemonID, String.class);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CONTENT_TYPE, "application/json");

        return new ResponseEntity<>(response.getBody(), headers, HttpStatus.OK);
    }
}
