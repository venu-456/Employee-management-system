package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@RestController
public class ProductController {
	String name="venu";	
	@RequestMapping("/test")
	public String test() {
		return "tested";
	}
	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("test");
		return mv;
	}
	@Autowired
	private ProductService service;
	
	@RequestMapping("/add")
	public ModelAndView addProduct() {
		ModelAndView mv= new ModelAndView();
		mv.setViewName("addproduct");
		return mv;
	}
	
	@PostMapping("/addProduct")
	public Product addProductToDB(Product product) {
		return service.saveProduct(product);
	}
	
	@PostMapping("/addProducts")
	public List<Product> addProduct(@RequestBody List<Product> products) {
		 return service.saveProducts(products);
		 
	}
	@GetMapping("/products")
	public List<Product> findAllProducts(){
		return service.getProducts();
	}
	@GetMapping("/productById/{id}")
	public ModelAndView findProductById(@PathVariable int id) {
		ModelAndView mv= new ModelAndView();
		mv.addObject("prd", service.getProductById(id));
		mv.setViewName("test");
		return mv;
	}
	@GetMapping("/prodByID")
	public ModelAndView PBI(@RequestParam int id) {
		ModelAndView mv= new ModelAndView("addproduct");
		Product product=service.getProductById(id);
		mv.addObject("prd",product);
		return mv;
	}
	
	@GetMapping("/productByName/{name}")
	public Product findProductByName(@PathVariable String name) {
		return service.getProductByName(name);
	}
	
	@PutMapping("/update")
	public Product updateProduct(@RequestBody Product product) {
		return service.updateProduct(product);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteProduct_pathV (@PathVariable int id) {
		return service.deleteProduct(id);
	}
	@PostMapping("/delete")
	public String deleteProduct(@RequestParam int id) {
		return service.deleteProduct(id)+" is deleted";
	}
}
