package com.mindtree.dao;

import com.mindtree.entity.Product;
import com.mindtree.exception.DaoException;

public interface Dao  {
boolean create(Product product)throws DaoException;

}
