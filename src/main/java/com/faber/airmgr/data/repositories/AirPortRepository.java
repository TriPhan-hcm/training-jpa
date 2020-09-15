package com.faber.airmgr.data.repositories;

import com.faber.airmgr.data.entities.AirPortEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface AirPortRepository.
 *
 * @author Quach Kim Huy
 * @email qkhuy.dev@gmail.com
 * @tel (+ 84) 343-900-994
 * @time 13/09/2020 19:00
 * @des todo
 */
@Repository
public interface AirPortRepository extends JpaRepository<AirPortEntity, Long> {
}
