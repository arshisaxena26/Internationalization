package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

	@Autowired
	private MessageSource messageSource;

	// Add Header Accept-Language in Postman : en,fr,,nl
	@GetMapping("/")
	public String getMessage() {
		return messageSource.getMessage("greeting", null, LocaleContextHolder.getLocale());
	}
}
