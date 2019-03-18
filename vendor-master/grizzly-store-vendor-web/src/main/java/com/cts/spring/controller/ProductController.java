package com.cts.spring.controller;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.cts.spring.entity.Product;
import com.cts.spring.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
    
	@Autowired
	ProductService productService;
	
	
	@GetMapping("/list")
	public String listAllProduct(Model model) {
     //System.out.println("Entered in Product");
     List<Product> list=productService.listProduct();
     //System.out.println("Product"+list);
	 model.addAttribute("products",list);
	// model.addAttribute("name","Rahul");
	 //System.out.println(model);
	return "admin-listproduct";
	}
	
	@GetMapping("/view")
	public String viewProduct(@RequestParam("productId") int id,Model model){
	Product product=productService.getProduct(id);
	//System.out.println(product);
	model.addAttribute("product", product);
	
	return "admin-view";
		
	}
	@PostMapping("/saveProduct")
	public String addProduct(@ModelAttribute("product") Product product){
		productService.saveProduct(product);
		return "redirect:/product/list";
		
	}
	@GetMapping("/addproduct")
	public String viewAddProductPage(){
		
		return "admin-addproduct";
	}
	
	@GetMapping("/delete")
	public String deleteProduct(@RequestParam("productId") int id){
		//System.out.println(id);
		productService.deleteProduct(id);
		return "redirect:/product/list";
		
	}
	@GetMapping("/logout")
	public String logOut(HttpServletRequest request,HttpServletResponse response)
	{
		Authentication auth=SecurityContextHolder.getContext().getAuthentication();
		if(auth!=null)
		{
			new SecurityContextLogoutHandler().logout(request, response, auth);
		}
		return "redirect:/";
	}
	@GetMapping("/lowToHigh")
	public String sortAsc(Model model){
		List<Product> list=productService.listProduct();
		list.sort(Comparator.comparing(Product::getPrice));
		model.addAttribute("products",list);
		return "admin-listproduct";
		
	}
	@GetMapping("/highToLow")
	public String sortDsc(Model model){
		List<Product> list=productService.listProduct();
		list.sort(Comparator.comparing(Product::getPrice).reversed());
		model.addAttribute("products",list);
		return "admin-listproduct";
		
	}
	@GetMapping("/sortByCategory")
	public String sortByCategory(Model model){
		List<Product> list=productService.listProduct();
		list.sort(Comparator.comparing(Product::getCategory));
		model.addAttribute("products",list);
		return "admin-listproduct";
	}

}
