package co.yedam.vo;

import java.util.Date;

import lombok.Data;

@Data
public class ProductVO {
	private String prdCode; //prd_code
	private String prdName; //prd_name
	private String prdDesc; //prd_desc
	private	int originprice; //origin_price
	private int salePrice;//sale_price
	private int starPoint;//star_point
	private String prodImage;//prod_image
	private Date creationDate;//creation_date
}
