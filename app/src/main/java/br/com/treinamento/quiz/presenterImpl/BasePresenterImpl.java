package br.com.treinamento.quiz.presenterImpl;

import br.com.treinamento.quiz.shared.presenter.BasePresenter;
import br.com.treinamento.quiz.shared.view.BaseView;

public abstract class BasePresenterImpl<V extends BaseView>
 implements BasePresenter {

    protected V view;

    public BasePresenterImpl(V view) {
        this.view = view;
    }
}
