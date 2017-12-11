package marcicand.com.br.topgames.infrastructure.local

import io.reactivex.Maybe
import marcicand.com.br.topgames.domain.model.TopGames

interface GamesLocalDataSet {

    fun getInitialGames() : Maybe<TopGames>
    fun save(it: TopGames)
}