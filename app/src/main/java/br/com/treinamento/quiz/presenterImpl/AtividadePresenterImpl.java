package br.com.treinamento.quiz.presenterImpl;

import br.com.treinamento.quiz.shared.presenter.AtividadePresenter;
import br.com.treinamento.quiz.shared.view.AtividadeView;

public class AtividadePresenterImpl extends BasePresenterImpl<AtividadeView>
        implements AtividadePresenter {

    public AtividadePresenterImpl(AtividadeView view) {
        super(view);
    }

    @Override
    public void onViewReady() {

    }
}
