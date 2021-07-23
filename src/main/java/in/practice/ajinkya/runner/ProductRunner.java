package in.practice.ajinkya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import in.practice.ajinkya.repo.ProductRepository;

@Component
public class ProductRunner {
	@Autowired
	private ProductRepository prepo;
	
	public ProductRunner() {
		System.out.println(prepo);
		prepo.save(null);
	}
}
