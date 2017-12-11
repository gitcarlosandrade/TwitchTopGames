package marcicand.com.br.topgames.infrastructure.remote

import io.reactivex.Maybe
import marcicand.com.br.topgames.infrastructure.Api
import marcicand.com.br.topgames.domain.model.TopGames

class GamesRemoteDatasetImpl(private val api : Api) : GamesRemoteDataSet {

    override fun getInitialGames(): Maybe<TopGames> {
        val response = api.getGames()?.execute()
        val games = response?.body()
        return Maybe.just(games)
    }
}