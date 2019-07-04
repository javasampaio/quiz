package br.com.treinamento.quiz.presenterImpl;

import android.widget.EditText;

import br.com.treinamento.quiz.shared.presenter.RegisterPresenter;
import br.com.treinamento.quiz.shared.view.RegisterView;

public class RegisterPresenterImpl
        extends BasePresenterImpl<RegisterView>
        implements RegisterPresenter {

    public RegisterPresenterImpl(RegisterView view) {
        super(view);
    }

    @Override
    public void onViewReady() {

    }

    @Override
    public void register(EditText editTextUsername, EditText editTextEmail, EditText editTextPassword) {

    }
}
