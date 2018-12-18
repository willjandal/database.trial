package com.example.database_trial;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;

import java.util.List;

public class MainActivity extends AndroidViewModel {

    private ProductRepository repository;
    private LiveData<List<Product>> allProducts;
    private MutableLiveData<List<Product>> searchResults;

    public MainActivity (Application application){
        super(application);
        repository = new ProductRepository(application);
        allProducts = repository.getAllProducts();
        searchResults = repository.getSearchResults();
    }

    MutableLiveData<List<Product>> getSearchResults(){
        return searchResults;
    }

    LiveData<List<Product>> getAllProducts(){
        return allProducts;
    }

    public void insertProduct(Product product){
        repository.insertProduct(product);
    }

    public void findProducts(String name) {
        repository.findProducts(name);
    }

    public void deleteProduct(String name) {
        repository.deleteProduct(name);
    }

}
