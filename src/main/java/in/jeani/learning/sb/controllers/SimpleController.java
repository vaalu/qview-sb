/**
 * 
 */
package in.jeani.learning.sb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 
 */
@RestController
public class SimpleController {
	
	@Autowired
	RestTemplate rest;
	
	@GetMapping("/countries")
	public String fetchCountries() {
		String url = "https://countriesnow.space/api/v0.1/countries/population/cities";
		ResponseEntity<String> response = rest.getForEntity(url, String.class);
		System.out.println("Response fetched: " + response.getBody());
		return response.getBody();
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
}
