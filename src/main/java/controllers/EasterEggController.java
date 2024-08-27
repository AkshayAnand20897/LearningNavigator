package controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/hidden-feature")
public class EasterEggController {

    private final RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/{number}")
    public String getNumberFact(@PathVariable int number) {
        String url = "http://numbersapi.com/" + number + "?json";
        return restTemplate.getForObject(url, String.class);
    }
}

