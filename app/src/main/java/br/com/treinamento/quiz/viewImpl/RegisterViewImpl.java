package br.com.treinamento.quiz.viewImpl;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.treinamento.quiz.R;
import br.com.treinamento.quiz.presenterImpl.RegisterPresenterImpl;
import br.com.treinamento.quiz.shared.presenter.RegisterPresenter;
import br.com.treinamento.quiz.shared.view.RegisterView;

public class RegisterViewImpl extends
        BaseActivity<RegisterPresenter>
        implements RegisterView, View.OnClickListener {

    private EditText editTextUsername;
    private EditText editTextEmail;
    private EditText editTextPassword;

    private Button buttonRegister;

    @Override
    protected RegisterPresenter getPresenter() {
        return new RegisterPresenterImpl(this);
    }

    @Override
    protected void bind() {
        editTextUsername = findViewById(R.id.edit_text_username);
        editTextEmail = findViewById(R.id.edit_text_email);
        editTextPassword = findViewById(R.id.edit_text_password);

        buttonRegister = findViewById(R.id.button_register);
        buttonRegister.setOnClickListener(this);
    }

    @Override
    protected int getLayoutView() {

        return R.layout.register_layout;
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button_register){
            presenter.register(editTextUsername, editTextEmail, editTextPassword);
        }
    }
}
