package com.asses.Flipkart;

import com.asses.Flipkart.entity.ProductEntity;
import com.asses.Flipkart.repository.FlipkartRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ProductEntity productEntity = new ProductEntity();
        productEntity.setName("grapes");
        productEntity.setPrice(35);
        productEntity.setDescription("its good");
        productEntity.setManfacture_date("2020-03-03");
        productEntity.setProduct_type("fruit");
        FlipkartRepository flipkartRepository = new FlipkartRepository();
        flipkartRepository.saveProductDetails(productEntity);
    }
    
}
