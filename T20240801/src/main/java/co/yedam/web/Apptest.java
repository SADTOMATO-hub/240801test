package co.yedam.web;

import java.util.List;

import co.yedam.service.ProductService;
import co.yedam.service.ProductServiceImpl;
import co.yedam.vo.ProductVO;

public class Apptest {

	public static void main(String[] args) {
		ProductService psv = new ProductServiceImpl();
		List<ProductVO> proLis = psv.productList();
		
		System.out.println(proLis);
		
	}

}
