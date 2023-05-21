package com.viraj.bansode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductService {
	
	public static List<Product> productList=new ArrayList<>();
	
	/**
	 * add supplied product in the list
	 * @param p
	 */
	public void addProduct(Product p) {
		productList.add(p);
	}
	
	/**
	 * loop through the list and search for first product who's name matches with 
	 * supplied test
	 * 
	 * @param text
	 * @return
	 */
	public Product searchProductByName(String text) {
				
		  return productList.stream().filter(p -> p.getName().equals(text)
		  ).findFirst() .orElse(null);
		 
	}
	
	/**
	 * loop through the list and search for first product which is present at
	 * supplied place name text
	 * 
	 * @param text
	 * @return
	 */
	public List<Product> searchProductByPlace(String text) {
		
		return productList.stream().filter(p -> {
			return p.getPlace().toLowerCase().equals(text.toLowerCase());
		}).collect(Collectors. toList());
	}
	
	/**
	 * search for all products in their details supplied text is present
	 * 
	 * @param text
	 * @return
	 */
	public List<Product> searchAllProductContains(String text) {
		
		return productList.stream().filter(p -> {
			return p.getName().toLowerCase().contains(text.toLowerCase()) 
					|| p.getPlace().toLowerCase().contains(text.toLowerCase())
			|| p.getColor().toLowerCase().contains(text.toLowerCase());
		}).collect(Collectors. toList());
	}
	
	
	/**
	 * list out all products who are out of warranty 
	 * 
	 * @return
	 */
	public List<Product> searchAllProductOutOfWarranty() {
		return productList.stream().filter(p -> {
			return p.getWarranty() <  2023;
		}).collect(Collectors. toList());
	}

}
