package in.practice.ajinkya.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.practice.ajinkya.model.Product;
import in.practice.ajinkya.repo.ProductRepository;

@Component
public class ProductRunner implements CommandLineRunner{
	@Autowired
	private ProductRepository prepo;
	
	
	public void run(String... args) throws Exception {
		System.out.println(prepo.getClass().getName());
		prepo.save(new Product(101, "HYD", "PEN", 200));
		prepo.save(new Product(102, "PUNE", "BOOK", 500));
		prepo.save(new Product(103, "BGL", "LAPTOP", 20000));
		prepo.save(new Product(103, "CHN", "MOBILE", 8000));

	}
}
