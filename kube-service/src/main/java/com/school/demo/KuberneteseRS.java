package com.school.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KuberneteseRS {

	@GetMapping("/hello")
	public String ping() {
		StringBuilder sb = new StringBuilder();		
		System.getenv().forEach((k,v)->{
			System.out.println(k + " = " + v);
			sb.append(k + " = " + v).append("\n");
		});
		return sb.toString();
	}
}
