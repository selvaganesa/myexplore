package com.trimble.agmantra.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.SqlUtils;

import com.trimble.agmantra.entity.Commodity;

import com.trimble.agmantra.entity.Crop;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table CROP.
*/
public class CropDao extends AbstractDao<Crop, Long> {

    public static final String TABLENAME = "CROP";

    /**
     * Properties of entity Crop.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Desc = new Property(1, String.class, "desc", false, "DESC");
        public final static Property IsServerdata = new Property(2, Boolean.class, "isServerdata", false, "IS_SERVERDATA");
        public final static Property Year = new Property(3, String.class, "year", false, "YEAR");
        public final static Property Status = new Property(4, Integer.class, "status", false, "STATUS");
        public final static Property CommodityId = new Property(5, Long.class, "commodityId", false, "COMMODITY_ID");
    };

    private DaoSession daoSession;


    public CropDao(DaoConfig config) {
        super(config);
    }
    
    public CropDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'CROP' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'DESC' TEXT," + // 1: desc
                "'IS_SERVERDATA' INTEGER," + // 2: isServerdata
                "'YEAR' TEXT," + // 3: year
                "'STATUS' INTEGER," + // 4: status
                "'COMMODITY_ID' INTEGER);"); // 5: commodityId
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'CROP'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Crop entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String desc = entity.getDesc();
        if (desc != null) {
            stmt.bindString(2, desc);
        }
 
        Boolean isServerdata = entity.getIsServerdata();
        if (isServerdata != null) {
            stmt.bindLong(3, isServerdata ? 1l: 0l);
        }
 
        String year = entity.getYear();
        if (year != null) {
            stmt.bindString(4, year);
        }
 
        Integer status = entity.getStatus();
        if (status != null) {
            stmt.bindLong(5, status);
        }
 
        Long commodityId = entity.getCommodityId();
        if (commodityId != null) {
            stmt.bindLong(6, commodityId);
        }
    }

    @Override
    protected void attachEntity(Crop entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Crop readEntity(Cursor cursor, int offset) {
        Crop entity = new Crop( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // desc
            cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0, // isServerdata
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // year
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // status
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5) // commodityId
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Crop entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setDesc(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setIsServerdata(cursor.isNull(offset + 2) ? null : cursor.getShort(offset + 2) != 0);
        entity.setYear(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setStatus(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setCommodityId(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Crop entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Crop entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
    private String selectDeep;

    protected String getSelectDeep() {
        if (selectDeep == null) {
            StringBuilder builder = new StringBuilder("SELECT ");
            SqlUtils.appendColumns(builder, "T", getAllColumns());
            builder.append(',');
            SqlUtils.appendColumns(builder, "T0", daoSession.getCommodityDao().getAllColumns());
            builder.append(" FROM CROP T");
            builder.append(" LEFT JOIN COMMODITY T0 ON T.'COMMODITY_ID'=T0.'_id'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Crop loadCurrentDeep(Cursor cursor, boolean lock) {
        Crop entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        Commodity commodity = loadCurrentOther(daoSession.getCommodityDao(), cursor, offset);
        entity.setCommodity(commodity);

        return entity;    
    }

    public Crop loadDeep(Long key) {
        assertSinglePk();
        if (key == null) {
            return null;
        }

        StringBuilder builder = new StringBuilder(getSelectDeep());
        builder.append("WHERE ");
        SqlUtils.appendColumnsEqValue(builder, "T", getPkColumns());
        String sql = builder.toString();
        
        String[] keyArray = new String[] { key.toString() };
        Cursor cursor = db.rawQuery(sql, keyArray);
        
        try {
            boolean available = cursor.moveToFirst();
            if (!available) {
                return null;
            } else if (!cursor.isLast()) {
                throw new IllegalStateException("Expected unique result, but count was " + cursor.getCount());
            }
            return loadCurrentDeep(cursor, true);
        } finally {
            cursor.close();
        }
    }
    
    /** Reads all available rows from the given cursor and returns a list of new ImageTO objects. */
    public List<Crop> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Crop> list = new ArrayList<Crop>(count);
        
        if (cursor.moveToFirst()) {
            if (identityScope != null) {
                identityScope.lock();
                identityScope.reserveRoom(count);
            }
            try {
                do {
                    list.add(loadCurrentDeep(cursor, false));
                } while (cursor.moveToNext());
            } finally {
                if (identityScope != null) {
                    identityScope.unlock();
                }
            }
        }
        return list;
    }
    
    protected List<Crop> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Crop> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
