package br.com.treinamento.quiz;

import android.app.Application;

public class QuizApplication extends Application {
    private static QuizApplication quizApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        quizApplication = this;
    }

    public static QuizApplication getInstance(){
        return quizApplication;
    }
}
