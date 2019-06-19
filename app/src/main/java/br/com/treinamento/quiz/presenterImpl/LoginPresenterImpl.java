package br.com.treinamento.quiz.presenterImpl;

import android.content.Context;
import android.content.Intent;
import android.widget.EditText;

import androidx.annotation.IdRes;

import br.com.treinamento.quiz.MainActivity;
import br.com.treinamento.quiz.QuizApplication;
import br.com.treinamento.quiz.R;
import br.com.treinamento.quiz.shared.presenter.LoginPresenter;
import br.com.treinamento.quiz.shared.view.LoginView;

public class LoginPresenterImpl extends BasePresenterImpl<LoginView>
 implements LoginPresenter {


    public LoginPresenterImpl(LoginView view) {
        super(view);
    }

    @Override
    public void onViewReady() {

    }

    @Override
    public void doLogin(String username, String password) {
        Intent nextView = new Intent((Context) view, MainActivity.class);
        ((Context) view).startActivity(nextView);
    }



}
