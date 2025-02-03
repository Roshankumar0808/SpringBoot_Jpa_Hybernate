package com.Jpa_Hybernate.Jpa_Hybernate;

import com.Jpa_Hybernate.Jpa_Hybernate.Entities.ProductEntity;
import com.Jpa_Hybernate.Jpa_Hybernate.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpaHybernateApplicationTests {
   @Autowired
	ProductRepository productRepository;
	@Test
	void contextLoads() {
	}
	@Test
	void testRepository(){

		ProductEntity productEntity=ProductEntity.builder()
				.sku("nestle569")
				.title("Nestle Choclolate")
				.price(BigDecimal.valueOf(565.55))
				.quantity(18)
				.build();
		ProductEntity SaveProduct=productRepository.save(productEntity);
		System.out.println(SaveProduct);
	}

	@Test
	void getRepository(){
		List<ProductEntity> entities=productRepository
				.findByTitleContainingIgnoreCase("Gooday Biscuits",null);
		System.out.println(entities);
	}
	@Test
	void getSingleRepo(){
		Optional<ProductEntity> productEntity=productRepository.findByTitleAndPrice("Parlee Biscuits",BigDecimal.valueOf(84));
	   productEntity.ifPresent( System.out::println);
	}



}
