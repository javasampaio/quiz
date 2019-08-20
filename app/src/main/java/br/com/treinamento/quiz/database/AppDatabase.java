package br.com.treinamento.quiz.database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import br.com.treinamento.quiz.database.model.User;

@Database(entities = {User.class}, version = 1, exportSchema = false)
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

   public static void destroyDatabase(){
       INSTANCE = null;
   }
}
