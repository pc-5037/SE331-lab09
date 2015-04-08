package camt.se331.shoppingcart.repository;

import camt.se331.shoppingcart.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ASUS on 8/4/2558.
 */
public interface ProductRepository extends JpaRepository<Product,Long> {

}
