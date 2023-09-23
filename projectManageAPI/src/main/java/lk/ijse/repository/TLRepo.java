package lk.ijse.repository;


import lk.ijse.entity.TL;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface TLRepo extends JpaRepository<TL, UUID> {
}
