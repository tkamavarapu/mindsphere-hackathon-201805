package com.siemens.mindsphere.hackathon.team02;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

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
public class UploadController {
		
    private final AtomicInteger counter = new AtomicInteger();

    @Autowired
    private RestTemplate restTemplate;
    @Value("${mindsphere.accessToken}")
    private String accessToken;
    
    @RequestMapping("/uploadtsdata")
    public ResponseEntity<String> uploadData() {
    	List<SensorAspect> sensors = new ArrayList<SensorAspect>();
    	while (counter.intValue() < 100) {
    		SensorAspect sensorData = new SensorAspect();
    		
    		Random r = new Random();
    		double currentValue = r.doubles(1, 100, 120).findFirst().getAsDouble();
    		double voltageValue = r.doubles(1, 50, 150).findFirst().getAsDouble();
    		Timestamp later = new Timestamp(System.currentTimeMillis() + counter.incrementAndGet() * 1000);
    		sensorData.setCurrent(currentValue);
    		sensorData.setVoltage(voltageValue);
    		sensorData.set_time(later);
    		sensors.add(sensorData);
        }
    	
    	HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.set("Authorization", "Bearer "+accessToken);
		
		HttpEntity<List<SensorAspect>> entity = new HttpEntity<>(sensors, headers);
		String url = "https://gateway.eu1.mindsphere.io/api/iottimeseries/v3/timeseries/f23aa73ac6dd4f2f994037e8ce3c56ed/NC_DallasDemoPrep_MCL_AspectType01";
		return restTemplate.exchange(url, HttpMethod.PUT, entity, String.class);

    }
    
}
