package vn.com.acb.vdc.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.com.acb.vdc.common.APIResponse;

@RestController
public class AcbController {
	
	@GetMapping("/check-health")
	public APIResponse checkHealth() {
		
		APIResponse apiResponse = new APIResponse
				.APIResponseBuilder("2021-07-10")
				.withDescription("check health of system")
				.withMessageStatus("message check health")
				.withCodeStatus(0)
				.build();
		return apiResponse;
	}
	
} 
