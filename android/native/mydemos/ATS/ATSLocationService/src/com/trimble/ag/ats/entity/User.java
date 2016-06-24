package com.trimble.ag.ats.entity;

import java.util.List;
import com.trimble.ag.ats.dao.DaoSession;
import de.greenrobot.dao.DaoException;

import com.trimble.ag.ats.dao.UserDao;
import com.trimble.ag.ats.dao.User_OrganizationDao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table "USER".
 */
public class User {

    private Long UserId;
    private Long serverUserId;
    private String userName;
    private String firstName;
    private String lastName;
    private String contactID;
    private String region;
    private Boolean minitourshown;
    /** Not-null value. */
    private String orgId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient UserDao myDao;

    private List<User_Organization> user_OrganizationList;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public User() {
    }

    public User(Long UserId) {
        this.UserId = UserId;
    }

    public User(Long UserId, Long serverUserId, String userName, String firstName, String lastName, String contactID, String region, Boolean minitourshown, String orgId) {
        this.UserId = UserId;
        this.serverUserId = serverUserId;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactID = contactID;
        this.region = region;
        this.minitourshown = minitourshown;
        this.orgId = orgId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getUserDao() : null;
    }

    public Long getUserId() {
        return UserId;
    }

    public void setUserId(Long UserId) {
        this.UserId = UserId;
    }

    public Long getServerUserId() {
        return serverUserId;
    }

    public void setServerUserId(Long serverUserId) {
        this.serverUserId = serverUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactID() {
        return contactID;
    }

    public void setContactID(String contactID) {
        this.contactID = contactID;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Boolean getMinitourshown() {
        return minitourshown;
    }

    public void setMinitourshown(Boolean minitourshown) {
        this.minitourshown = minitourshown;
    }

    /** Not-null value. */
    public String getOrgId() {
        return orgId;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    /** To-many relationship, resolved on first access (and after reset). Changes to to-many relations are not persisted, make changes to the target entity. */
    public List<User_Organization> getUser_OrganizationList() {
        if (user_OrganizationList == null) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            User_OrganizationDao targetDao = daoSession.getUser_OrganizationDao();
            List<User_Organization> user_OrganizationListNew = targetDao._queryUser_User_OrganizationList(UserId);
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