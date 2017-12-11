package marcicand.com.br.topgames.presentation.contract

import marcicand.com.br.topgames.domain.usecase.InitialDataUseCase
import marcicand.com.br.topgames.presentation.mapper.toPresentation

class MainPresenterImpl(private val view: MainContract.View,
                        private val initialDataUseCase: InitialDataUseCase) : MainContract.Presenter {

    override fun getInitialData() {
        initialDataUseCase.execute(params = Unit)
                .doOnSuccess {
                    it.toPresentation()
                    view.showInitialData(it.toPresentation()) }
                .doOnError { view.showErrorInitialData(it.cause) }
    }
}
