package com.example.database_trial;

import android.arch.lifecycle.LiveData;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface ProductDao {

    @Insert
    void insertProduct(Product product);

    @Query("SELECT * FROM products WHERE productName = :name")
    List<Product> findProducts(String name);

    @Query("DELETE FROM products WHERE productName = :name")
    void deleteProducts(String name);

    @Query("SELECT * FROM products")
    LiveData<List<Product>> getAllProducts();
}
