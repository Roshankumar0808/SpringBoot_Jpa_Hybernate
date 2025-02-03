package com.Jpa_Hybernate.Jpa_Hybernate.Controller;

import com.Jpa_Hybernate.Jpa_Hybernate.Entities.ProductEntity;
import com.Jpa_Hybernate.Jpa_Hybernate.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/products")
public class ProductController {
    ProductRepository productRepository;
   private final int Page_Size=5;
    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<ProductEntity> getAllProducts(@RequestParam(defaultValue = "")String title,@RequestParam(defaultValue ="id") String sortBy, @RequestParam (defaultValue ="0") Integer pageNumber){
      //  return productRepository.findBy(Sort.by(Sort.Direction.DESC,sortBy,"price"));
//        return productRepository.findBy(Sort.by(Sort.Order.desc(sortBy),
//                Sort.Order.desc("title")
//        ));
//        Pageable pageable= PageRequest.of(
//                pageNumber
//                ,Page_Size,
//                Sort.by(sortBy));
//        return productRepository.findByTitle(pageable).getContent();
        return productRepository.findByTitleContainingIgnoreCase(
                title,
                PageRequest.of(pageNumber,Page_Size,Sort.by(sortBy))
        );

    }
}
