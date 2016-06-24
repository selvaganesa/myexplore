package com.trimble.agmantra.entity;

import com.trimble.agmantra.dao.DaoSession;

import de.greenrobot.dao.DaoException;
import de.greenrobot.dao.QueryBuilder;

import com.trimble.agmantra.dao.AttributeInfoEntityDao;
import com.trimble.agmantra.dao.TemplateTypeDao;
import com.trimble.agmantra.dbutil.AgDataStoreResources;

import java.util.List;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table ATTRIBUTE_INFO_ENTITY.
 */
public class AttributeInfoEntity {

    private Long id;
    private Integer dataType;
    private String defaultValue;
    private String Minvalue;
    private String Maxvalue;
    private String Condition;
    private Integer display;
    private Integer editable;
    private String lastenter;
    private String fdtTag;
    private String name;
    private Integer length;
    private Integer encode;
    private Long TemplatetypeId;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient AttributeInfoEntityDao myDao;

    private TemplateType templateType;
    private Long templateType__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    //private HashMap<k, V> 
    // KEEP FIELDS END

    public AttributeInfoEntity() {
    }

    public AttributeInfoEntity(Long id) {
        this.id = id;
    }

    public AttributeInfoEntity(Long id, Integer dataType, String defaultValue, String Minvalue, String Maxvalue, String Condition, Integer display, Integer editable, String lastenter, String fdtTag, String name, Integer length, Integer encode, Long TemplatetypeId) {
        this.id = id;
        this.dataType = dataType;
        this.defaultValue = defaultValue;
        this.Minvalue = Minvalue;
        this.Maxvalue = Maxvalue;
        this.Condition = Condition;
        this.display = display;
        this.editable = editable;
        this.lastenter = lastenter;
        this.fdtTag = fdtTag;
        this.name = name;
        this.length = length;
        this.encode = encode;
        this.TemplatetypeId = TemplatetypeId;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getAttributeInfoEntityDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getMinvalue() {
        return Minvalue;
    }

    public void setMinvalue(String Minvalue) {
        this.Minvalue = Minvalue;
    }

    public String getMaxvalue() {
        return Maxvalue;
    }

    public void setMaxvalue(String Maxvalue) {
        this.Maxvalue = Maxvalue;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String Condition) {
        this.Condition = Condition;
    }

    public Integer getDisplay() {
        return display;
    }

    public void setDisplay(Integer display) {
        this.display = display;
    }

    public Integer getEditable() {
        return editable;
    }

    public void setEditable(Integer editable) {
        this.editable = editable;
    }

    public String getLastenter() {
        return lastenter;
    }

    public void setLastenter(String lastenter) {
        this.lastenter = lastenter;
    }

    public String getFdtTag() {
        return fdtTag;
    }

    public void setFdtTag(String fdtTag) {
        this.fdtTag = fdtTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public Integer getEncode() {
        return encode;
    }

    public void setEncode(Integer encode) {
        this.encode = encode;
    }

    public Long getTemplatetypeId() {
        return TemplatetypeId;
    }

    public void setTemplatetypeId(Long TemplatetypeId) {
        this.TemplatetypeId = TemplatetypeId;
    }

    /** To-one relationship, resolved on first access. */
    public TemplateType getTemplateType() {
        if (templateType__resolvedKey == null || !templateType__resolvedKey.equals(TemplatetypeId)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TemplateTypeDao targetDao = daoSession.getTemplateTypeDao();
            
            QueryBuilder<TemplateType> qb = targetDao
                    .queryBuilder();
              qb.where(com.trimble.agmantra.dao.TemplateTypeDao.Properties.Templateid
                      
                    .eq(TemplatetypeId),com.trimble.agmantra.dao.TemplateTypeDao.Properties.Locale
                    
                  .eq(AgDataStoreResources.EN_LOCALE));
              
             List<TemplateType> templateTypes= qb.list();
            templateType = templateTypes.get(0);
            templateType__resolvedKey = TemplatetypeId;
        } if (templateType__resolvedKey == null || !templateType__resolvedKey.equals(TemplatetypeId)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            TemplateTypeDao targetDao = daoSession.getTemplateTypeDao();
            templateType = targetDao.load(TemplatetypeId);
            templateType__resolvedKey = TemplatetypeId;
        }
        return templateType;
    }

    public void setTemplateType(TemplateType templateType) {
        this.templateType = templateType;
        TemplatetypeId = templateType == null ? null : templateType.getId();
        templateType__resolvedKey = TemplatetypeId;
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