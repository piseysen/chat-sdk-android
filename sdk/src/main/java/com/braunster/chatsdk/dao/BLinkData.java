package com.braunster.chatsdk.dao;

import com.braunster.chatsdk.dao.DaoSession;
import de.greenrobot.dao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
import com.braunster.chatsdk.dao.core.Entity;
import com.braunster.chatsdk.network.firebase.BPath;

import java.util.Date;
import java.util.Map;
// KEEP INCLUDES END
/**
 * Entity mapped to table BLINK_DATA.
 */
public class BLinkData extends Entity<BLinkData>  {

    private Long id;
    private Long UserID;
    private Long ThreadID;

    /** Used to resolve relations */
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    private transient BLinkDataDao myDao;

    private BUser bUser;
    private Long bUser__resolvedKey;

    private BThread bThread;
    private Long bThread__resolvedKey;


    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public BLinkData() {
    }

    public BLinkData(Long id) {
        this.id = id;
    }

    public BLinkData(Long id, Long UserID, Long ThreadID) {
        this.id = id;
        this.UserID = UserID;
        this.ThreadID = ThreadID;
    }

    /** called by internal mechanisms, do not call yourself. */
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getBLinkDataDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserID() {
        return UserID;
    }

    public void setUserID(Long UserID) {
        this.UserID = UserID;
    }

    public Long getThreadID() {
        return ThreadID;
    }

    public void setThreadID(Long ThreadID) {
        this.ThreadID = ThreadID;
    }

    /** To-one relationship, resolved on first access. */
    public BUser getBUser() {
        Long __key = this.UserID;
        if (bUser__resolvedKey == null || !bUser__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BUserDao targetDao = daoSession.getBUserDao();
            BUser bUserNew = targetDao.load(__key);
            synchronized (this) {
                bUser = bUserNew;
            	bUser__resolvedKey = __key;
            }
        }
        return bUser;
    }

    public void setBUser(BUser bUser) {
        synchronized (this) {
            this.bUser = bUser;
            UserID = bUser == null ? null : bUser.getId();
            bUser__resolvedKey = UserID;
        }
    }

    /** To-one relationship, resolved on first access. */
    public BThread getBThread() {
        Long __key = this.ThreadID;
        if (bThread__resolvedKey == null || !bThread__resolvedKey.equals(__key)) {
            if (daoSession == null) {
                throw new DaoException("Entity is detached from DAO context");
            }
            BThreadDao targetDao = daoSession.getBThreadDao();
            BThread bThreadNew = targetDao.load(__key);
            synchronized (this) {
                bThread = bThreadNew;
            	bThread__resolvedKey = __key;
            }
        }
        return bThread;
    }

    public void setBThread(BThread bThread) {
        synchronized (this) {
            this.bThread = bThread;
            ThreadID = bThread == null ? null : bThread.getId();
            bThread__resolvedKey = ThreadID;
        }
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
    @Override
    public void updateFrom(BLinkData bLinkData) {

    }

    @Override
    public BPath getPath() {
        return null;
    }

    @Override
    public Type getEntityType() {
        return null;
    }

    @Override
    public void updateFromMap(Map<String, Object> map) {

    }

    @Override
    public Map<String, Object> asMap() {
        return null;
    }

    @Override
    public Object getPriority() {
        return null;
    }

    @Override
    public Date lastUpdated() {
        return null;
    }
    // KEEP METHODS END

}
