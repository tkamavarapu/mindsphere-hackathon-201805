package com.siemens.mindsphere.hackathon.team02;

import org.json.JSONException;
import org.json.JSONObject;
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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class EventController {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${mindsphere.accessToken}")
    private String accessToken;
    
    @RequestMapping("/events")
    public String viewErrorEvents() throws JSONException, JsonProcessingException {
    	
    	HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer "+accessToken);
		
		HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
		

		Filter filterData = new Filter();
		filterData.setEntityId("f23aa73ac6dd4f2f994037e8ce3c56ed");
		filterData.setAcknowledged(false);
		FilterTimestamp filterTs = new FilterTimestamp();
		filterTs.setBetween("[2018-05-25T00:00:00.001Z,2018-05-25T18:51:45.377Z)");
		filterData.setTimestamp(filterTs);
		JSONObject obj = new JSONObject();
		ObjectMapper mapper = new ObjectMapper();
		obj.put("filter", filterData);
		String eventUrl = "https://gateway.eu1.mindsphere.io/api/iottimeseries/v3/events?filter=" + mapper.writeValueAsString(filterData) + "&size=1000";
		
		ResponseEntity<String> result = restTemplate.exchange(eventUrl, HttpMethod.GET, entity, String.class);
		//System.out.println(result.getBody());
          
    	return result.getBody();
    }
    
}
