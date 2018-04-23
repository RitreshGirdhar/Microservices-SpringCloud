package com.test.MS2;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ApiController {

	@GetMapping("/v1")
    public String test() {
        return "OK";
    }
	
}
