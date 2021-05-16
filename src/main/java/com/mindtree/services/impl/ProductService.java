package com.mindtree.services.impl;

import com.mindtree.dao.Dao;
import com.mindtree.dao.impl.UserDao;
import com.mindtree.entity.Product;
import com.mindtree.exception.DaoException;
import com.mindtree.exception.DuplicateFlagException;
import com.mindtree.exception.ServiceException;
import com.mindtree.services.Service;

public class ProductService implements Service {
	private Dao dao;

	public ProductService() {
		super();
		dao = new UserDao();
	}

	public boolean createInventory(Product product) throws ServiceException {
		boolean isproductcreated=false;
		if(!isProductExist(product.getId())) {
			try {
				isproductcreated=dao.create(product);
			}
			catch (DaoException e) {
				throw new ServiceException(e.getMessage(),e.getCause());
			}
		}
		else {
			throw new DuplicateFlagException("Product is already created..");
		}
		return isproductcreated;
	}

	private boolean isProductExist(int id) {
		
		return false;
	}

}
