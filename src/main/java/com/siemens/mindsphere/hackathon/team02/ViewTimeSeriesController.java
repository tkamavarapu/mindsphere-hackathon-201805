package com.siemens.mindsphere.hackathon.team02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ViewTimeSeriesController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${mindsphere.accessToken}")
    private String accessToken;
    
    @RequestMapping("/viewtsdata")
    public String viewTimeSeriesData() {
    	
    	HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer "+accessToken);
		
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		
		ResponseEntity<String> result = restTemplate.exchange(
				"https://gateway.eu1.mindsphere.io/api/iottimeseries/v3/timeseries/f23aa73ac6dd4f2f994037e8ce3c56ed/NC_DallasDemoPrep_MCL_AspectType01?from=2018-05-25T00:00:00Z&to=2018-05-25T23:50:00Z", HttpMethod.GET, entity, String.class);
		//System.out.println(result.getBody());
		
    	return result.getBody();
    }
    
}
