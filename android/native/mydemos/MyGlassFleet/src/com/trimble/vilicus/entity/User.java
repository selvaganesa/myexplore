package com.trimble.vilicus.entity;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table USER.
 */
public class User {

    private Long userid;
    private String name;
    /** Not-null value. */
    private String orgId;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public User() {
    }

    public User(Long userid) {
        this.userid = userid;
    }

    public User(Long userid, String name, String orgId) {
        this.userid = userid;
        this.name = name;
        this.orgId = orgId;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /** Not-null value. */
    public String getOrgId() {
        return orgId;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setOrgId(String orgId) {
        this.orgId = orgId;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}