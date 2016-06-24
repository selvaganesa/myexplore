package com.trimble.vilicus.dao;

import java.util.List;
import java.util.ArrayList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.DaoConfig;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.SqlUtils;

import com.trimble.vilicus.entity.User;

import com.trimble.vilicus.entity.Asset;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table ASSET.
*/
public class AssetDao extends AbstractDao<Asset, Long> {

    public static final String TABLENAME = "ASSET";

    /**
     * Properties of entity Asset.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Name = new Property(1, String.class, "name", false, "NAME");
        public final static Property Type = new Property(2, String.class, "type", false, "TYPE");
        public final static Property Make = new Property(3, String.class, "make", false, "MAKE");
        public final static Property Heading = new Property(4, Double.class, "heading", false, "HEADING");
        public final static Property IconID = new Property(5, Integer.class, "iconID", false, "ICON_ID");
        public final static Property Speed = new Property(6, Double.class, "speed", false, "SPEED");
        public final static Property Latitude = new Property(7, Double.class, "latitude", false, "LATITUDE");
        public final static Property Longitude = new Property(8, Double.class, "longitude", false, "LONGITUDE");
        public final static Property Status = new Property(9, String.class, "status", false, "STATUS");
        public final static Property UpdatedUTC = new Property(10, java.util.Date.class, "updatedUTC", false, "UPDATED_UTC");
        public final static Property Userid = new Property(11, Long.class, "userid", false, "USERID");
    };

    private DaoSession daoSession;


    public AssetDao(DaoConfig config) {
        super(config);
    }
    
    public AssetDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'ASSET' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'NAME' TEXT," + // 1: name
                "'TYPE' TEXT," + // 2: type
                "'MAKE' TEXT," + // 3: make
                "'HEADING' REAL," + // 4: heading
                "'ICON_ID' INTEGER," + // 5: iconID
                "'SPEED' REAL," + // 6: speed
                "'LATITUDE' REAL," + // 7: latitude
                "'LONGITUDE' REAL," + // 8: longitude
                "'STATUS' TEXT," + // 9: status
                "'UPDATED_UTC' INTEGER," + // 10: updatedUTC
                "'USERID' INTEGER);"); // 11: userid
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'ASSET'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Asset entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String name = entity.getName();
        if (name != null) {
            stmt.bindString(2, name);
        }
 
        String type = entity.getType();
        if (type != null) {
            stmt.bindString(3, type);
        }
 
        String make = entity.getMake();
        if (make != null) {
            stmt.bindString(4, make);
        }
 
        Double heading = entity.getHeading();
        if (heading != null) {
            stmt.bindDouble(5, heading);
        }
 
        Integer iconID = entity.getIconID();
        if (iconID != null) {
            stmt.bindLong(6, iconID);
        }
 
        Double speed = entity.getSpeed();
        if (speed != null) {
            stmt.bindDouble(7, speed);
        }
 
        Double latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindDouble(8, latitude);
        }
 
        Double longitude = entity.getLongitude();
        if (longitude != null) {
            stmt.bindDouble(9, longitude);
        }
 
        String status = entity.getStatus();
        if (status != null) {
            stmt.bindString(10, status);
        }
 
        java.util.Date updatedUTC = entity.getUpdatedUTC();
        if (updatedUTC != null) {
            stmt.bindLong(11, updatedUTC.getTime());
        }
 
        Long userid = entity.getUserid();
        if (userid != null) {
            stmt.bindLong(12, userid);
        }
    }

    @Override
    protected void attachEntity(Asset entity) {
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
    public Asset readEntity(Cursor cursor, int offset) {
        Asset entity = new Asset( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // name
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // type
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // make
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // heading
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // iconID
            cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6), // speed
            cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7), // latitude
            cursor.isNull(offset + 8) ? null : cursor.getDouble(offset + 8), // longitude
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // status
            cursor.isNull(offset + 10) ? null : new java.util.Date(cursor.getLong(offset + 10)), // updatedUTC
            cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11) // userid
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Asset entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setName(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setType(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setMake(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setHeading(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setIconID(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setSpeed(cursor.isNull(offset + 6) ? null : cursor.getDouble(offset + 6));
        entity.setLatitude(cursor.isNull(offset + 7) ? null : cursor.getDouble(offset + 7));
        entity.setLongitude(cursor.isNull(offset + 8) ? null : cursor.getDouble(offset + 8));
        entity.setStatus(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setUpdatedUTC(cursor.isNull(offset + 10) ? null : new java.util.Date(cursor.getLong(offset + 10)));
        entity.setUserid(cursor.isNull(offset + 11) ? null : cursor.getLong(offset + 11));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Asset entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Asset entity) {
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
            SqlUtils.appendColumns(builder, "T0", daoSession.getUserDao().getAllColumns());
            builder.append(" FROM ASSET T");
            builder.append(" LEFT JOIN USER T0 ON T.'USERID'=T0.'USERID'");
            builder.append(' ');
            selectDeep = builder.toString();
        }
        return selectDeep;
    }
    
    protected Asset loadCurrentDeep(Cursor cursor, boolean lock) {
        Asset entity = loadCurrent(cursor, 0, lock);
        int offset = getAllColumns().length;

        User user = loadCurrentOther(daoSession.getUserDao(), cursor, offset);
        entity.setUser(user);

        return entity;    
    }

    public Asset loadDeep(Long key) {
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
    public List<Asset> loadAllDeepFromCursor(Cursor cursor) {
        int count = cursor.getCount();
        List<Asset> list = new ArrayList<Asset>(count);
        
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
    
    protected List<Asset> loadDeepAllAndCloseCursor(Cursor cursor) {
        try {
            return loadAllDeepFromCursor(cursor);
        } finally {
            cursor.close();
        }
    }
    

    /** A raw-style query where you can pass any WHERE clause and arguments. */
    public List<Asset> queryDeep(String where, String... selectionArg) {
        Cursor cursor = db.rawQuery(getSelectDeep() + where, selectionArg);
        return loadDeepAllAndCloseCursor(cursor);
    }
 
}
