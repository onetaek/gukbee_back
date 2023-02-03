package product.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductService {
	
	Map<String,Product> products = new HashMap<>();
	
	public ProductService() {
		Product product = new Product("101","애플사과폰 12","애플전자",1200000,"2020.12.12");
		products.put("101", product);
		product = new Product("102","갤럭시 12","삼어전자",1300000,"2021.2.12");
		products.put("102",product);
		product = new Product("103","엘스듀얼폰 12","LG전자",1500000,"2021.3.2");
		products.put("103",product);
	}
	
	public List<Product> findAll(){
		//MAP이 리스트 형태로 반환해서 리턴.
		return new ArrayList<>(products.values());
	}
	
	public Product find(String id) {
		//인자로 받은 키값으로 상품을 검색해서 Product 객체를 반환.
		return products.get(id);
	}
}
