package br.com.treinamento.quiz.viewImpl;

import br.com.treinamento.quiz.R;
import br.com.treinamento.quiz.presenterImpl.AtividadePresenterImpl;
import br.com.treinamento.quiz.shared.presenter.AtividadePresenter;
import br.com.treinamento.quiz.shared.view.AtividadeView;

public class AtividadeViewImpl extends BaseActivity<AtividadePresenter>
implements AtividadeView {
    @Override
    protected AtividadePresenter getPresenter() {
        return new AtividadePresenterImpl(this);
    }

    @Override
    protected void bind() {

    }

    @Override
    protected int getLayoutView() {
        return R.layout.atividade;
    }
}
