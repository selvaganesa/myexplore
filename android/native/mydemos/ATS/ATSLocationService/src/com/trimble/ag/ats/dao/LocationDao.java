package com.trimble.ag.ats.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.trimble.ag.ats.entity.Location;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "LOCATION".
*/
public class LocationDao extends AbstractDao<Location, Long> {

    public static final String TABLENAME = "LOCATION";

    /**
     * Properties of entity Location.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property LocationId = new Property(0, Long.class, "locationId", true, "LOCATION_ID");
        public final static Property Latitude = new Property(1, Double.class, "latitude", false, "LATITUDE");
        public final static Property Longtitude = new Property(2, Double.class, "longtitude", false, "LONGTITUDE");
        public final static Property Speed = new Property(3, Double.class, "speed", false, "SPEED");
        public final static Property Heading = new Property(4, Double.class, "heading", false, "HEADING");
        public final static Property Time = new Property(5, Long.class, "time", false, "TIME");
        public final static Property IsSynced = new Property(6, Boolean.class, "isSynced", false, "IS_SYNCED");
        public final static Property OrgId = new Property(7, String.class, "orgId", false, "ORG_ID");
        public final static Property Altitude = new Property(8, Double.class, "altitude", false, "ALTITUDE");
    };


    public LocationDao(DaoConfig config) {
        super(config);
    }
    
    public LocationDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"LOCATION\" (" + //
                "\"LOCATION_ID\" INTEGER PRIMARY KEY ," + // 0: locationId
                "\"LATITUDE\" REAL," + // 1: latitude
                "\"LONGTITUDE\" REAL," + // 2: longtitude
                "\"SPEED\" REAL," + // 3: speed
                "\"HEADING\" REAL," + // 4: heading
                "\"TIME\" INTEGER," + // 5: time
                "\"IS_SYNCED\" INTEGER," + // 6: isSynced
                "\"ORG_ID\" TEXT," + // 7: orgId
                "\"ALTITUDE\" REAL);"); // 8: altitude
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"LOCATION\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Location entity) {
        stmt.clearBindings();
 
        Long locationId = entity.getLocationId();
        if (locationId != null) {
            stmt.bindLong(1, locationId);
        }
 
        Double latitude = entity.getLatitude();
        if (latitude != null) {
            stmt.bindDouble(2, latitude);
        }
 
        Double longtitude = entity.getLongtitude();
        if (longtitude != null) {
            stmt.bindDouble(3, longtitude);
        }
 
        Double speed = entity.getSpeed();
        if (speed != null) {
            stmt.bindDouble(4, speed);
        }
 
        Double heading = entity.getHeading();
        if (heading != null) {
            stmt.bindDouble(5, heading);
        }
 
        Long time = entity.getTime();
        if (time != null) {
            stmt.bindLong(6, time);
        }
 
        Boolean isSynced = entity.getIsSynced();
        if (isSynced != null) {
            stmt.bindLong(7, isSynced ? 1L: 0L);
        }
 
        String orgId = entity.getOrgId();
        if (orgId != null) {
            stmt.bindString(8, orgId);
        }
 
        Double altitude = entity.getAltitude();
        if (altitude != null) {
            stmt.bindDouble(9, altitude);
        }
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Location readEntity(Cursor cursor, int offset) {
        Location entity = new Location( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // locationId
            cursor.isNull(offset + 1) ? null : cursor.getDouble(offset + 1), // latitude
            cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2), // longtitude
            cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3), // speed
            cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4), // heading
            cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5), // time
            cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0, // isSynced
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // orgId
            cursor.isNull(offset + 8) ? null : cursor.getDouble(offset + 8) // altitude
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Location entity, int offset) {
        entity.setLocationId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setLatitude(cursor.isNull(offset + 1) ? null : cursor.getDouble(offset + 1));
        entity.setLongtitude(cursor.isNull(offset + 2) ? null : cursor.getDouble(offset + 2));
        entity.setSpeed(cursor.isNull(offset + 3) ? null : cursor.getDouble(offset + 3));
        entity.setHeading(cursor.isNull(offset + 4) ? null : cursor.getDouble(offset + 4));
        entity.setTime(cursor.isNull(offset + 5) ? null : cursor.getLong(offset + 5));
        entity.setIsSynced(cursor.isNull(offset + 6) ? null : cursor.getShort(offset + 6) != 0);
        entity.setOrgId(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setAltitude(cursor.isNull(offset + 8) ? null : cursor.getDouble(offset + 8));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Location entity, long rowId) {
        entity.setLocationId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Location entity) {
        if(entity != null) {
            return entity.getLocationId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}