package com.viraj.bansode;

public class Main {

	public static void main(String[] args) {
		
		ProductService productService = new ProductService();
		
		productService.addProduct(new Product("Asus Laptop","desk","black",2024));
		productService.addProduct(new Product("Dell Laptop","black table","Silver",2023));
		productService.addProduct(new Product("Dell Mouse","table","black",2022));
		productService.addProduct(new Product("Moniter","desk","black",2021));
		productService.addProduct(new Product("Samsung Projector","table","white",2022));
		productService.addProduct(new Product("HP mouse","desk","white",2021));
		productService.addProduct(new Product("MI mic","black desk","silver",2024));
		productService.addProduct(new Product("nikon camera","desk","black",2022));
		
		System.out.println("======searchProductByName : 'Dell Laptop' ========");
		System.out.println(productService.searchProductByName("Dell Laptop"));
		System.out.println();
		
		System.out.println("======searchProductByPlace : 'desk' ========");
		productService.searchProductByPlace("desk").forEach(System.out::println);
		System.out.println();
		
		System.out.println("======searchAllProductContains :' black' ========");
		productService.searchAllProductContains("black").forEach(System.out::println);
		System.out.println();
		
		System.out.println("======searchAllProductOutOfWarranty========");
		productService.searchAllProductOutOfWarranty().forEach(System.out::println);
		

	}
	
	

}
