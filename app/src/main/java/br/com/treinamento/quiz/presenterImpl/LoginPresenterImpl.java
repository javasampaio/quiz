package br.com.treinamento.quiz.presenterImpl;

import android.content.Context;
import android.content.Intent;

import br.com.treinamento.quiz.viewImpl.AtividadeViewImpl;
import br.com.treinamento.quiz.viewImpl.MainActivity;
import br.com.treinamento.quiz.QuizApplication;
import br.com.treinamento.quiz.shared.presenter.LoginPresenter;
import br.com.treinamento.quiz.shared.view.LoginView;
import br.com.treinamento.quiz.viewImpl.RegisterViewImpl;

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

    @Override
    public void register() {
        Intent registeView = new Intent(QuizApplication.getInstance(), RegisterViewImpl.class);
        QuizApplication.getInstance().startActivity(registeView);
    }

    @Override
    public void openAtividade() {
        Intent atividadeView = new Intent(QuizApplication.getInstance(), AtividadeViewImpl.class);
        QuizApplication.getInstance().startActivity(atividadeView);
    }
}
