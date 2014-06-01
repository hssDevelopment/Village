package com.hssdevelopment.village.api.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AttendeeController {
	@RequestMapping(value = "/attendee")
	@ResponseBody
	public String getAttendees(){
		return "This is an attendee";
	}
}
