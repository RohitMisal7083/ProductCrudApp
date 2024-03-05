package com.scrud.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.scrud.dao.ProductDao;
import com.scrud.entites.Product;

@Controller
public class HomeController {
	
	@Autowired
	private ProductDao productDao;
	
	@RequestMapping("/home")
	public String homePage(Model m) {
		
		List<Product> products=productDao.getAllProducts();
		m.addAttribute("product", products);
		
		
		
		return "home";
	}

	@RequestMapping("/add_product")
	public String addProduct(Model m) {
		
		m.addAttribute("title","Add Product");
		return "add_product_form";
	}
	
	@RequestMapping(value = "/handle-product", method=RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product,HttpServletRequest req) {
		
		System.out.println(product);
		productDao.createProduct(product);
		RedirectView redirect=new  RedirectView();
		redirect.setUrl(req.getContextPath()+"/");
		return redirect;
	}
	
	@RequestMapping("/delete/{productId}")
	public RedirectView deleteProduct(@PathVariable("productId") int productId,HttpServletRequest req) {
		
		this.productDao.deleteProduct(productId);
		RedirectView redirect=new  RedirectView();
		redirect.setUrl(req.getContextPath()+"/");
		return redirect;
	}
	
	@RequestMapping("/update/{productId}")
	public String updateProduct(@PathVariable("productId") int p_id,Model m ){
		
		Product product=this.productDao.getSingleProduct(p_id);
		m.addAttribute("product",product);
		return "update_form";		
	}
}
