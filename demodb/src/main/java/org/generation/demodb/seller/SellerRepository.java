package org.generation.demodb.seller;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
public interface SellerRepository extends JpaRepository<seller, Long> {
        @Query("SELECT u FROM user u WHERE u.username=?1")
        Optional<seller> findUserByName (String username);
}//interface
