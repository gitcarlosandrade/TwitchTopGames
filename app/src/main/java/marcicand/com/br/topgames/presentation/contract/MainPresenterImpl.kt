package marcicand.com.br.topgames.presentation.contract

import android.widget.Toast
import marcicand.com.br.topgames.domain.usecase.InitialDataUseCase
import marcicand.com.br.topgames.presentation.mapper.toPresentation

class MainPresenterImpl(var view: MainContract.View,
                        var initialDataUseCase: InitialDataUseCase)
    : MainContract.Presenter {

    override fun subscribe() {
//        initialDataUseCase.execute(params = Unit)
//                .doOnSuccess {
//                    view.showInitialData(it.toPresentation())
//                }
//                .doOnError {
//                    view.showErrorInitialData(it.cause)
//                }
        view.showMessage("subscribe")
    }

    override fun unSubscribe() {

    }
}
