package com.faber.airmgr.services.impl;

import com.faber.airmgr.data.entities.AirPortEntity;
import com.faber.airmgr.data.repositories.AirPortRepository;
import com.faber.airmgr.services.AirPortService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * The class AirPortServiceImpl.
 *
 * @author Quach Kim Huy
 * @email qkhuy.dev@gmail.com
 * @tel (+ 84) 343-900-994
 * @time 13/09/2020 19:01
 * @des todo
 */
@Slf4j
@Service
public class AirPortServiceImpl implements AirPortService {

    private final AirPortRepository airPortRepository;

    public AirPortServiceImpl(AirPortRepository airPortRepository) {
        this.airPortRepository = airPortRepository;
    }

    @Override
    public List<AirPortEntity> findAll() {
        return this.airPortRepository.findAll();
    }
}
