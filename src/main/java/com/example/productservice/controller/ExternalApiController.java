package com.example.productservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ExternalApiController {
	@RequestMapping("/weather")	 
public String getWeather(@RequestParam("city") String city) {
	String url = "http://api.weatherstack.com/current?access_key=8b5eb8476b78b3fe7a1284791126f887&query=+city" ;
	RestTemplate restTemplate = new RestTemplate();
	String weatherData = restTemplate.getForObject(url, String.class);
	return weatherData;
}
}