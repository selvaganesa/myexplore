package com.trimble.ag.ats.entity;

import java.util.List;
import com.trimble.ag.ats.dao.DaoSession;
import de.greenrobot.dao.DaoException;

import com.trimble.ag.ats.dao.OrganizationDao;
import com.trimble.ag.ats.dao.User_OrganizationDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "ORGANIZATION".
 */
public class Organization {

    private String orgId;
    private String name;
    private Boolean isPrimaryOrg;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient OrganizationDao myDao;

    private List<User_Organization> user_OrganizationList;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Organization() {
    }

    public Organization(String orgId) {
        this.orgId = orgId;
    }

    public Organization(String orgId, String name, Boolean isPrimaryOrg) {
        this.orgId = orgId;
        this.name = name;
        this.isPrimaryOrg = isPrimaryOrg;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getOrganizationDao() : null;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsPrimaryOrg() {
        return isPrimaryOrg;
    }

    public void setIsPrimaryOrg(Boolean isPrimaryOrg) {
        this.isPrimaryOrg = isPrimaryOrg;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<User_Organization> getUser_OrganizationList() {
        if (user_OrganizationList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            User_OrganizationDao targetDao = daoSession.getUser_OrganizationDao();
            List<User_Organization> user_OrganizationListNew = targetDao._queryOrganization_User_OrganizationList(orgId);
            synchronized (this) {
                if(user_OrganizationList == null) {
                    user_OrganizationList = user_OrganizationListNew;
                }
            }
        }
        return user_OrganizationList;
    }

    /** Resets a to-many relationship, making the next get call to query for a fresh result. */
    public synchronized void resetUser_OrganizationList() {
        user_OrganizationList = null;
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
