package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {
    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);
}
