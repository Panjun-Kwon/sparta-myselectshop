package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.*;
import org.springframework.data.jpa.repository.*;

import java.util.*;

public interface FolderRepository extends JpaRepository<Folder, Long> {
    List<Folder> findAllByUserAndNameIn(User user, List<String> folderNames);
    // select * from folder where user_id = ? and name in ('1', '2', '3');

    List<Folder> findAllByUser(User user);
}
