package com.almabase.Assignment.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.almabase.Assignment.service.BirthdayService;

@Service
public class BirthdayServiceImpl implements BirthdayService {

	@Value("${wish.start}")
	private String wishStart;

	@Value("${wish.end}")
	private String wishEnd;

	@Override
	public String getBirthdayWish(String username) {
		return wishStart + username + wishEnd;
	}

}
