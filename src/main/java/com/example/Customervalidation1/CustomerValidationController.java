package com.example.Customervalidation1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerValidationController {
	@GetMapping(path="/person")
	public boolean getCutomerDetails(@RequestParam String accId) {
		if(accId.substring(0,2).equals("20")) {
			return true;
		}
		return false;
	}

}
