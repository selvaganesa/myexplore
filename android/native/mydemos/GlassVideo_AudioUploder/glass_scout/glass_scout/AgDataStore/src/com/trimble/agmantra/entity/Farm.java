package com.trimble.agmantra.entity;

import com.trimble.agmantra.dao.DaoSession;
import de.greenrobot.dao.DaoException;

import com.trimble.agmantra.dao.ClientDao;
import com.trimble.agmantra.dao.FarmDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table FARM.
 */
public class Farm {

    private Long id;
    private String desc;
    private Integer locked;
    private Integer deleted;
    private Boolean isServerdata;
    private Integer status;
    private Long clientId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient FarmDao myDao;

    private Client client;
    private Long client__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Farm() {
    }

    public Farm(Long id) {
        this.id = id;
    }

    public Farm(Long id, String desc, Integer locked, Integer deleted, Boolean isServerdata, Integer status, Long clientId) {
        this.id = id;
        this.desc = desc;
        this.locked = locked;
        this.deleted = deleted;
        this.isServerdata = isServerdata;
        this.status = status;
        this.clientId = clientId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getFarmDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getLocked() {
        return locked;
    }

    public void setLocked(Integer locked) {
        this.locked = locked;
    }

    public Integer getDeleted() {
        return deleted;
    }

    public void setDeleted(Integer deleted) {
        this.deleted = deleted;
    }

    public Boolean getIsServerdata() {
        return isServerdata;
    }

    public void setIsServerdata(Boolean isServerdata) {
        this.isServerdata = isServerdata;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    /** To-one relationship, resolved on first access. */
    public Client getClient() {
        if (client__resolvedKey == null || !client__resolvedKey.equals(clientId)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            ClientDao targetDao = daoSession.getClientDao();
            client = targetDao.load(clientId);
            client__resolvedKey = clientId;
        }
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
        clientId = client == null ? null : client.getId();
        client__resolvedKey = clientId;
    }

    /** Convenient call for {@link AbstractDao#delete(Object)}. Entity must attached to an entity context. */
    public void delete() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.delete(this);
    }

    /** Convenient call for {@link AbstractDao#update(Object)}. Entity must attached to an entity context. */
    public void update() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.update(this);
    }

    /** Convenient call for {@link AbstractDao#refresh(Object)}. Entity must attached to an entity context. */
    public void refresh() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }    
        myDao.refresh(this);
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}