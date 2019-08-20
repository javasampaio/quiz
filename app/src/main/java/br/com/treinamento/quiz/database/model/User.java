package br.com.treinamento.quiz.database.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "User")
public class User {

    @PrimaryKey(autoGenerate = true)
    public int id;

    @ColumnInfo(name = "USER_NAME")
    public String userName;

    @ColumnInfo(name = "PASSWORD")
    public String password;
}
