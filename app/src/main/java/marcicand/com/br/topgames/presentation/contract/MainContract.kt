package marcicand.com.br.topgames.presentation.contract

import marcicand.com.br.topgames.presentation.model.GamesViewModel

interface MainContract {

    interface Presenter {
        fun getInitialData()
    }

    interface View {
        fun showInitialData(games: GamesViewModel)
        fun showErrorInitialData(cause: Throwable?)
    }
}