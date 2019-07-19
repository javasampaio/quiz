package br.com.treinamento.quiz.presenterImpl;

import android.widget.EditText;

import br.com.treinamento.quiz.R;
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
        if(!validateEditText(editTextUsername))
            setError(editTextUsername, R.string.error_username);
        else
            cleanError(editTextUsername);

        if(!validateEditText(editTextEmail)){
            setError(editTextEmail, R.string.error_email);
        } else {
            cleanError(editTextEmail);
        }

        if(!validateEditText(editTextPassword)){
            setError(editTextPassword, R.string.error_password);
        } else {
            cleanError(editTextPassword);
        }
    }
}
