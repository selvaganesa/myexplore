package com.trimble.agmantra.entity;

import com.trimble.agmantra.dao.DaoSession;
import de.greenrobot.dao.DaoException;

import com.trimble.agmantra.dao.AttributeInfoEntityDao;
import com.trimble.agmantra.dao.PickListDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table PICK_LIST.
 */
public class PickList {

    private Long id;
    private String item;
    private String name;
    private String GroupId;
    private Long attrinfoId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient PickListDao myDao;

    private AttributeInfoEntity attributeInfoEntity;
    private Long attributeInfoEntity__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public PickList() {
    }

    public PickList(Long id) {
        this.id = id;
    }

    public PickList(Long id, String item, String name, String GroupId, Long attrinfoId) {
        this.id = id;
        this.item = item;
        this.name = name;
        this.GroupId = GroupId;
        this.attrinfoId = attrinfoId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getPickListDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroupId() {
        return GroupId;
    }

    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    public Long getAttrinfoId() {
        return attrinfoId;
    }

    public void setAttrinfoId(Long attrinfoId) {
        this.attrinfoId = attrinfoId;
    }

    /** To-one relationship, resolved on first access. */
    public AttributeInfoEntity getAttributeInfoEntity() {
        if (attributeInfoEntity__resolvedKey == null || !attributeInfoEntity__resolvedKey.equals(attrinfoId)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            AttributeInfoEntityDao targetDao = daoSession.getAttributeInfoEntityDao();
            attributeInfoEntity = targetDao.load(attrinfoId);
            attributeInfoEntity__resolvedKey = attrinfoId;
        }
        return attributeInfoEntity;
    }

    public void setAttributeInfoEntity(AttributeInfoEntity attributeInfoEntity) {
        this.attributeInfoEntity = attributeInfoEntity;
        attrinfoId = attributeInfoEntity == null ? null : attributeInfoEntity.getId();
        attributeInfoEntity__resolvedKey = attrinfoId;
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