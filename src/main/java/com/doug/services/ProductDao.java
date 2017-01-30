package com.doug.services;

import com.doug.domain.Product;

/**
 * Created by doug on 1/26/17.
 */

//just for learning mockito and mocking
public interface ProductDao {

    int getAvailableProducts(Product product);

    int orderProduct(Product product, int orderedQuantity);

}
