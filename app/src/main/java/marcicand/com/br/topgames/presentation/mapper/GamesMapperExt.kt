package marcicand.com.br.topgames.presentation.mapper

import marcicand.com.br.topgames.domain.model.TopGames
import marcicand.com.br.topgames.presentation.model.Game
import marcicand.com.br.topgames.presentation.model.GamesViewModel

fun TopGames.toPresentation() : GamesViewModel {
    val gvm = arrayListOf<Game>()
    val games = this.games?.flatMap {
        val games = Game(id = it.game.id, name = it.game.name, image = it.game.logo?.medium)
        gvm.add(games)
        gvm
    }
    return GamesViewModel(this.total, games)
}