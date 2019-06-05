package br.com.treinamento.quiz.viewImpl;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import br.com.treinamento.quiz.shared.presenter.BasePresenter;
import br.com.treinamento.quiz.shared.view.BaseView;

public abstract class BaseActivity<P extends BasePresenter>
extends AppCompatActivity implements BaseView {

    protected P presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutView());
        bind();
        presenter = getPresenter();
        onViewReady();
    }

    private void onViewReady() {
    }
    protected abstract P getPresenter();

    protected abstract void bind();

    protected abstract int getLayoutView();

    @Override
    public void back() {

    }
}
