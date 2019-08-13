package br.com.treinamento.quiz.presenterImpl;

import br.com.treinamento.quiz.viewImpl.MainActivity;
import br.com.treinamento.quiz.shared.presenter.MainPresenter;
import br.com.treinamento.quiz.shared.view.MainView;

public class MainPresenterImpl extends BasePresenterImpl<MainView>
implements MainPresenter {

    public MainPresenterImpl(MainActivity view) {
        super(view);
    }

    @Override
    public void onViewReady() {

    }
}
