package br.com.treinamento.quiz.viewImpl;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import br.com.treinamento.quiz.R;
import br.com.treinamento.quiz.presenterImpl.LoginPresenterImpl;
import br.com.treinamento.quiz.shared.presenter.LoginPresenter;
import br.com.treinamento.quiz.shared.view.LoginView;

public class LoginViewImpl extends BaseActivity<LoginPresenter>
implements LoginView, View.OnClickListener {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;

    @Override
    protected LoginPresenter getPresenter() {
        return new LoginPresenterImpl(this);
    }

    @Override
    protected void bind() {
        editTextUsername = findViewById(R.id.edit_text_user_login);
        editTextPassword = findViewById(R.id.edit_text_user_password);
        buttonLogin = findViewById(R.id.button_user_sign);
        buttonLogin.setOnClickListener(this);
    }

    @Override
    protected int getLayoutView() {
        return R.layout.login_layout;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.button_user_sign){
            presenter.doLogin(editTextUsername.getText().toString(),
                    editTextPassword.getText().toString());
        }
    }
}
