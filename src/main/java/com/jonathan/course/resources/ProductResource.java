package com.jonathan.course.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.jonathan.course.entities.Product;
import com.jonathan.course.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> products = service.findAll();
		return ResponseEntity.ok().body(products);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findbyId(@PathVariable Long id){
		Product product = service.findById(id);
		return ResponseEntity.ok().body(product);
	}
	
	@PostMapping
	public ResponseEntity<Product> insert(@RequestBody Product obj){
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").
				buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}
	
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteById(@PathVariable Long id){
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@PutMapping(value = "/{id}")
	public ResponseEntity<Product> update(@PathVariable Long id, @RequestBody Product obj){
		obj = service.update(id, obj);
		return ResponseEntity.ok().body(obj);
		
	}

}
