package com.doug.services;

import com.doug.domain.Product;

/**
 * Created by doug on 1/26/17.
 */

// to learn Mockito

public class ProductService {
    private ProductDao productDao;
    public void setProductDao(ProductDao productDao) {
        this.productDao = productDao;
    }
    public boolean buy(Product product, int orderedQuantity) throws InsufficientProductsException {
        boolean transactionStatus=false;
        int availableQuantity = productDao.getAvailableProducts(product);
        if (orderedQuantity > availableQuantity) {
            throw new InsufficientProductsException();
        }
        productDao.orderProduct(product, orderedQuantity);
        transactionStatus=true;
        return transactionStatus;
    }

}