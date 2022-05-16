package com.practice.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.practice.test.model.UserMobileNumber;

@Component
public class UserAuthenticationServiceImpl implements UserAuthenticationService {
	private final RestTemplate restTemplate;

    @Autowired
    public UserAuthenticationServiceImpl(RestTemplateBuilder builder) {
        this.restTemplate = builder.build();
    }


	@Override
	public String getOTP(String mobNumber) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		UserMobileNumber userMobileNumber = new UserMobileNumber();

		userMobileNumber.setMobile(mobNumber);
		String uri = "https://cdn-api.co-vin.in/api/v2/auth/public/generateOTP";

		HttpEntity<UserMobileNumber> requestEntity = new HttpEntity<>(userMobileNumber, headers);

		String result = restTemplate.postForObject(uri, requestEntity, String.class);
		return result;
	}

	 @Bean
	    public RestTemplate restTesmplate() {
	        return new RestTemplate();
	    }

}
