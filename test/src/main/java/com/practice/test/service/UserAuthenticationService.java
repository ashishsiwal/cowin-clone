package com.practice.test.service;

import com.practice.test.model.UserMobileNumber;

public interface UserAuthenticationService {

	public String getOTP(String mobileNumber);
}
