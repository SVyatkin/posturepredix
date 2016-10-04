package com.altran.acs.predix.labs.data.jpa.web;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.cache.Cache.ValueWrapper;
import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.altran.acs.predix.labs.data.jpa.domain.Customer;
import com.altran.acs.predix.labs.data.jpa.service.CustomerService;

@ComponentScan
@RestController
public class CacheController {

	@Autowired private CustomerService customerService;
	@Autowired private CacheManager cm;
	@Autowired private RedisTemplate<String, ?> redisTemplate;

	public static final String CACHE = "/cache";
	public static final String GET_CACHE_BY_NAME = CACHE + "/{name}";

	@RequestMapping(value = CACHE, method = RequestMethod.GET)
	public String allCache() throws Exception {
		String ks = "";
		Collection<String> cmn = cm.getCacheNames();
		for (String cacheName : cmn) {
			ks += getCacheDump(cacheName);
		}
		return ks;
	}
	
	@RequestMapping(value = GET_CACHE_BY_NAME, method = RequestMethod.GET)
	public String cacheByName(@PathVariable String name) throws Exception {
		return getCacheDump(name);
	}

	private String getCacheDump(String cacheName) {
		String ks = "";
		switch (cacheName) {
		case CustomerService.CUSTOMERS:
			Cache cacheCustomers = cm.getCache(CustomerService.CUSTOMERS);
			ks = getTitle(CustomerService.CUSTOMERS);
			List<Customer> customers = customerService.getAllCustomers();
			for (Customer v : customers) {
				ValueWrapper t = cacheCustomers.get(v.getId());
				if (t != null)
					ks += v.getId() 
					        + ":Name:" + v.getName()
							+ ":Phone:" + v.getPhone()
							+ "<br>";
			}
			break;
		default: ks = "<br>" + cacheName + " - Cache is not captured";

		}
		return ks;
	}

	private String getTitle(String customers) {
		return "<br>" + customers
				+ " - Cache contains records: <br><br>";
	}
}