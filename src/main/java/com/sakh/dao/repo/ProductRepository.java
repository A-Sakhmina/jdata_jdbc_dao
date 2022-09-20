package com.sakh.dao.repo;

import java.util.List;

public interface ProductRepository {
    List<String> getProductName(String name);
}
