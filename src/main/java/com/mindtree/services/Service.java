package com.mindtree.services;

import com.mindtree.entity.Product;
import com.mindtree.exception.ServiceException;

public interface Service {
boolean createInventory(Product product)throws ServiceException;
}
