/**
 * 
 */
package in.jeani.learning.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * 
 */
@Service
public class CountryService {

	@Autowired
	RestTemplate rest;
	
	public String fetchCountries() {
		String url = "https://countriesnow.space/api/v0.1/countries/population/cities";
		ResponseEntity<String> response = rest.getForEntity(url, String.class);
		System.out.println("Response fetched: " + response.getBody());
		return response.getBody();
	}
	
}
