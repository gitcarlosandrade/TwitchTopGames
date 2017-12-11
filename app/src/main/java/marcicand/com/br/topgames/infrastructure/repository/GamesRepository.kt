package marcicand.com.br.topgames.infrastructure.repository

import io.reactivex.Maybe
import marcicand.com.br.topgames.domain.model.TopGames

interface GamesRepository {

    fun getInitialData() : Maybe<TopGames>
}