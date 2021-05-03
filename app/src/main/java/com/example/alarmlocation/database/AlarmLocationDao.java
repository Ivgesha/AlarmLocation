package com.example.alarmlocation.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.alarmlocation.model.AlarmEntity;

import java.util.List;

@Dao
public interface AlarmLocationDao {
    @Insert
    void insert(AlarmEntity alarmEntity);

    @Update
    void update(AlarmEntity alarmEntity);

    @Delete
    void delete(AlarmEntity alarmEntity);

    @Query("Delete from alarmLocations")
    void deleteAllAlarmEntities();

    @Query("SELECT * FROM alarmLocations")
    ListData<List<AlarmEntity>> getAllAlarmEntities();





}
