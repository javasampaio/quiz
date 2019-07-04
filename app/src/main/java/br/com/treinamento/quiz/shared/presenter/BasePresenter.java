package br.com.treinamento.quiz.shared.presenter;

import android.widget.EditText;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;

public interface BasePresenter {
    void onViewReady();

    boolean validateEditText(@NonNull EditText editText);

    void setError(@NonNull EditText editText, @IdRes int message);

    void cleanError(@NonNull EditText editText);
}
