package com.example.restservice.services;

import com.example.restservice.product.Product;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class ProductService {
   private List<Product > products;
   private int number_of_type_of_products;

    public ProductService() {
        number_of_type_of_products = 0 ;
    }

    public List<Product> getproducts(){
       return products;
   }

   public void addProduct (String product_name , Integer qty ) {
       for(int i = 0 ; i < number_of_products ; ++i ) {
           name = products[i].getName() ;
           // TODO : chck before adding the prodcut
           if (name.equals(product_name)){
               this.product[i].setQuantity +=   qty ;
           }else {
               this.number_of_type_of_products ++;
               this.products.push(new Product (number_of_type_of_products , product_name , qty) );
           }

       }


    }


}
