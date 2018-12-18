package com.example.database_trial;

import java.util.List;

public interface AsyncResult {
    void asyncFinished(List<Product> results);
}
