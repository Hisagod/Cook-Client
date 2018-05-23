package com.aib.db.dao;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;

import com.aib.db.entity.TypeEntity;

@Dao
public interface TypeDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void save(TypeEntity type);
}
