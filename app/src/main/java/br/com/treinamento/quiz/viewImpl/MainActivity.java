package br.com.treinamento.quiz.viewImpl;


import android.widget.TextView;
import android.widget.Toast;

import br.com.treinamento.quiz.R;
import br.com.treinamento.quiz.presenterImpl.MainPresenterImpl;
import br.com.treinamento.quiz.shared.presenter.MainPresenter;
import br.com.treinamento.quiz.shared.view.MainView;

public class MainActivity extends BaseActivity<MainPresenter>
        implements MainView{

    @Override
    protected MainPresenter getPresenter() {
        return new MainPresenterImpl(this);
    }

    @Override
    protected void bind() {
        TextView textView = findViewById(R.id.text_view_hello);
        Toast.makeText(this,
                textView.getText().toString(), Toast.LENGTH_LONG).show();
    }

    @Override
    protected int getLayoutView() {
        return R.layout.activity_main;
    }
}
