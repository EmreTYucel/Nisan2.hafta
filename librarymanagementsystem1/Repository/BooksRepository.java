package com.acunmedyajsbrfs13.pair.librarymanagementsystem1.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.acunmedyajsbrfs13.pair.librarymanagementsystem1.Entity.Product;
@Repository
public interface BooksRepository extends JpaRepository<Product, Integer> {
}
