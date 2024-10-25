package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.discovery.DiscoveryClient;

@RestController
public class CompanyController {
	
	@Autowired
	private RestTemplate restTemplate;

	//@Autowired
	//private DiscoveryClient discoveryClient;

	@GetMapping("/company/product")
	public String getProductDetails() {
	    //List<String> services = discoveryClient.getServices();
	    //System.out.println("Available services: " + services);
	    return restTemplate.getForObject("http://product-service/product", String.class);
	}
    @GetMapping("/company/order")
    public String getOrderDetails() {
        return restTemplate.getForObject("http://order-service/order", String.class);
    }
	
}
