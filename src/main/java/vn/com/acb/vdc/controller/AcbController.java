package vn.com.acb.vdc.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.com.acb.vdc.common.APIResponse;

@RestController
public class AcbController {
	
	
	@GetMapping("/check-health")
	public APIResponse checkHealth() {
		
		return new APIResponse();
	}
	
	
	@GetMapping("/test")
	public APIResponse test() {
		
		return new APIResponse();
	}
}
