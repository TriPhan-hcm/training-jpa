package com.faber.airmgr.data.repositories;

import com.faber.airmgr.data.entities.OrderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface OrderRepository.
 *
 * @author Quach Kim Huy
 * @email qkhuy.dev@gmail.com
 * @tel (+ 84) 343-900-994
 * @time 9/13/2020
 */
@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
}
