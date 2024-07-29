package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByUser(User user);
}
