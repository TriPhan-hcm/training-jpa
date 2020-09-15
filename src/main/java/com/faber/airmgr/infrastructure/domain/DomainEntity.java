package com.faber.airmgr.infrastructure.domain;

import lombok.Data;

import java.io.Serializable;

/**
 * The class DomainEntity.
 *
 * @author Quach Kim Huy
 * @email qkhuy.dev@gmail.com
 * @tel (+ 84) 343-900-994
 * @time 13/09/2020 18:45
 * @des todo
 */
@Data
public abstract class DomainEntity<T> implements Serializable {
    public abstract T getId();

    public abstract void setId(T id);
}
