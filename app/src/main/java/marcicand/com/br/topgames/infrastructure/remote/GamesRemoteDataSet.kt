package marcicand.com.br.topgames.infrastructure.remote

import io.reactivex.Maybe
import marcicand.com.br.topgames.domain.model.TopGames

interface GamesRemoteDataSet {

    fun getInitialGames() : Maybe<TopGames>
}