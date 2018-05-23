package com.aib.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;

import com.aib.db.dao.TypeDao;
import com.aib.db.entity.TypeEntity;

@Database(entities = {TypeEntity.class}, version = 1, exportSchema = false)
public abstract class CookDataBase extends RoomDatabase {
    abstract TypeDao typeDao();
}
