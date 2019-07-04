package br.com.treinamento.quiz.shared.presenter;

import android.widget.EditText;

public interface RegisterPresenter extends BasePresenter {
    void register(EditText editTextUsername, EditText editTextEmail, EditText editTextPassword);
}
