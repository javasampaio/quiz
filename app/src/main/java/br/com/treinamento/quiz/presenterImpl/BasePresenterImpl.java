package br.com.treinamento.quiz.presenterImpl;

import android.widget.EditText;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;

import br.com.treinamento.quiz.QuizApplication;
import br.com.treinamento.quiz.shared.presenter.BasePresenter;
import br.com.treinamento.quiz.shared.view.BaseView;

public abstract class BasePresenterImpl<V extends BaseView>
 implements BasePresenter {

    protected V view;

    public BasePresenterImpl(V view) {
        this.view = view;
    }

    @Override
    public boolean validateEditText(@NonNull EditText editText) {
        return !editText.getText().toString().trim().isEmpty();
    }

    @Override
    public void setError(@NonNull EditText editText,@IdRes int message) {
        editText.setError(QuizApplication.getInstance().getString(message));
    }

    @Override
    public void cleanError(@NonNull EditText editText) {

    }
}
