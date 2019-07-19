package br.com.treinamento.quiz.database;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

public abstract class AppDatabase extends RoomDatabase {
    private static AppDatabase INSTANCE = null;

   private AppDatabase(){}

   public static AppDatabase getInstance(Context context){
       if(INSTANCE == null){
           Room.databaseBuilder(context, AppDatabase.class, "quiz_database")
                   .allowMainThreadQueries()
                   .fallbackToDestructiveMigration()
                   .build();
       }

       return INSTANCE;
   }
}
