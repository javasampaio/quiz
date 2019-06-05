package br.com.treinamento.quiz.viewImpl;

import br.com.treinamento.quiz.shared.presenter.LoginPresenter;
import br.com.treinamento.quiz.shared.view.LoginView;

public class LoginViewImpl extends BaseActivity<LoginPresenter>
implements LoginView {

    @Override
    protected LoginPresenter getPresenter() {
        return null;
    }

    @Override
    protected void bind() {

    }

    @Override
    protected int getLayoutView() {
        return 0;
    }
}
