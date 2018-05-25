package com.siemens.mindsphere.hackathon.team02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
		
	}
	
}
//	@Bean
//	public CommandLineRunner run() throws Exception {
//		return args -> {
//			System.out.println("Hello World");
//		};
//	}
	
//	@Bean
//	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
//		return args -> {
//			String accessToken = "eyJhbGciOiJSUzI1NiIsImtpZCI6ImtleS1pZC0xIiwidHlwIjoiSldUIn0.eyJqdGkiOiI2YmUzMzM2NWNjYWY0NmQyYWVjODYyNWM0ZGE3OTEwOCIsInN1YiI6ImNiYTEwMjM2LTg2YmYtNGEyNS04MDU0LWNiMjRmY2ExNjA2MyIsInNjb3BlIjpbIm1kc3A6Y29yZTphbmFseXRpY3MudXNlciIsIm1kc3A6Y29yZTphZ20ucmVhZG9ubHkiLCJtZHNwOmNvcmU6bWluZGNvbm5lY3QuZnVsbGFjY2VzcyIsIm1kc3A6Y29yZTppb3QudHNhVXNlciIsIm1kc3A6Y29yZTppb3QudGltQWRtaW4iLCJtZHNwOmNvcmU6aW90LnRpbVVzZXIiLCJtZHNwOmNvcmU6ZW0uZXZlbnRjcmVhdG9yIiwibWRzcDpjb3JlOmVtLmV2ZW50bWFuYWdlciIsIm1kc3A6Y29yZTphc3NldG1hbmFnZW1lbnQuc3RhbmRhcmR1c2VyIiwidG9rZW5hcHAudG9rZW5hcHBzY29wZSJdLCJjbGllbnRfaWQiOiJ0b2tlbmFwcC1zb2xhcmMwMiIsImNpZCI6InRva2VuYXBwLXNvbGFyYzAyIiwiYXpwIjoidG9rZW5hcHAtc29sYXJjMDIiLCJncmFudF90eXBlIjoiYXV0aG9yaXphdGlvbl9jb2RlIiwidXNlcl9pZCI6ImNiYTEwMjM2LTg2YmYtNGEyNS04MDU0LWNiMjRmY2ExNjA2MyIsIm9yaWdpbiI6InNvbGFyYzAyIiwidXNlcl9uYW1lIjoic29sYXJjLWhhY2thdGhvbnMtMDlAbWluZHNwaGVyZS5pbyIsImVtYWlsIjoic29sYXJjLWhhY2thdGhvbnMtMDlAbWluZHNwaGVyZS5pbyIsImF1dGhfdGltZSI6MTUyNzI2MTQzMiwicmV2X3NpZyI6Ijk5MTc2YzI0IiwiaWF0IjoxNTI3MjYxNDMzLCJleHAiOjE1MjcyNjMyMzMsImlzcyI6Imh0dHBzOi8vc29sYXJjMDIucGlhbS5ldTEubWluZHNwaGVyZS5pby9vYXV0aC90b2tlbiIsInppZCI6InNvbGFyYzAyIiwiYXVkIjpbIm1kc3A6Y29yZTppb3QiLCJtZHNwOmNvcmU6bWluZGNvbm5lY3QiLCJtZHNwOmNvcmU6YW5hbHl0aWNzIiwibWRzcDpjb3JlOmFzc2V0bWFuYWdlbWVudCIsInRva2VuYXBwLXNvbGFyYzAyIiwibWRzcDpjb3JlOmFnbSIsInRva2VuYXBwIiwibWRzcDpjb3JlOmVtIl0sInRlbiI6InNvbGFyYzAyIiwic2NoZW1hcyI6WyJ1cm46c2llbWVuczptaW5kc3BoZXJlOmlhbTp2MSJdLCJjYXQiOiJ1c2VyLXRva2VuOnYxIn0.NxiggsdBru5idYwuXi_O-ncvsC-XKEwbLJ3YdLKO1lEp_fmjcFcB1JTNVFxvU2sFgmJjdqVGkYAFzvliKw0G_5vs9Dk-FrPDqvhVg5_lFrksjGaVIhdW25kE07myii7SheO-VMqeu92pPoyedbqvXm08fltKN3f9V8fe1mlRvkutxMo13EKY8QnsB5YWGzhpcipx0DB04lVYQItqvWx1TFdJ-dtg9ru__Ogya4D0R0fTmdZIWKzjZz_ckr3SfVsXa925H7WIhZ8L28Vrs-v0OEdcsLYN2I9cesQ8ScdKCJPyNNkrz8CBfRoZGDn8APFUp2zkLC_9HNiQecgdnlHyMg";
//			HttpHeaders headers = new HttpHeaders();
//			headers.setContentType(MediaType.APPLICATION_JSON);
//			headers.set("Authorization", "Bearer "+accessToken);
//			
//			HttpEntity<String> entity = new HttpEntity<>("parameters", headers);
//			
//			ResponseEntity<String> result = restTemplate.exchange(
//					"https://gateway.eu1.mindsphere.io/api/assetmanagement/v3/assets?size=500", HttpMethod.GET, entity, String.class);
//			System.out.println(result.getBody());
//
//			
//		};
//	}
//}
