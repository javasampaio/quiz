package br.com.treinamento.quiz.presenterImpl;

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
}
