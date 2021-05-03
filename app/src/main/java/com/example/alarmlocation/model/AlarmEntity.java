package com.example.alarmlocation.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "alarmLocations")  // dont think we need it when we use firebase
public class AlarmEntity {
    @PrimaryKey(autoGenerate = true)        // dont think we need it because firebase allready have an autogenerate key.
    int taskId;
    int taskLatitude;
    int taskLongitude;

    public AlarmEntity(int taskId, int taskLatitude, int taskLongitude) {
        this.taskId = taskId;
        this.taskLatitude = taskLatitude;
        this.taskLongitude = taskLongitude;
    }

    public int getTaskId() {
        return taskId;
    }

    public int getTaskLatitude() {
        return taskLatitude;
    }

    public void setTaskLatitude(int taskLatitude) {
        this.taskLatitude = taskLatitude;
    }

    public int getTaskLongtitude() {
        return taskLongitude;
    }

    public void setTaskLongtitude(int taskLongtitude) {
        this.taskLongitude = taskLongtitude;
    }
}
