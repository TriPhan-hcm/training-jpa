package com.faber.airmgr.services;

import com.faber.airmgr.data.entities.AirPortEntity;

import java.util.List;

/**
 * The class AirPortService.
 *
 * @author Quach Kim Huy
 * @email qkhuy.dev@gmail.com
 * @tel (+ 84) 343-900-994
 * @time 13/09/2020 19:01
 * @des todo
 */
public interface AirPortService {
    List<AirPortEntity> findAll();
}
