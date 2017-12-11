package marcicand.com.br.topgames.infrastructure.local

import io.objectbox.BoxStore
import io.reactivex.Maybe
import marcicand.com.br.topgames.domain.model.TopGames
import marcicand.com.br.topgames.infrastructure.local.entity.Game
import marcicand.com.br.topgames.infrastructure.model.Box
import marcicand.com.br.topgames.infrastructure.model.Logo

class GamesLocalDataSetImpl(private val boxStore: BoxStore) : GamesLocalDataSet {

    override fun getInitialGames(): Maybe<TopGames> {
        return Maybe.just(TopGames())
    }

    override fun save(it: TopGames) {
        val entitiy = boxStore.boxFor(Game::class.java)
        val game = Game()
        it.games?.map {
            game.box.target = it.game.box?.toEntity()
            game.logo.target = it.game.logo.toEntity()
            game.id = it.game.id.toLong()
            game.locale = it.game.locale
            game.name = it.game.name
            game.localizedName = it.game.localizedName
            game.popularity = it.game.popularity

        }
        entitiy.put(game)
    }
}

private fun Logo.toEntity(): marcicand.com.br.topgames.infrastructure.local.entity.Logo {
    val logo = marcicand.com.br.topgames.infrastructure.local.entity.Logo()
    logo.large = this.large
    logo.medium = this.medium
    logo.small = this.small
    logo.template = this.template
    return logo
}

private fun Box.toEntity(): marcicand.com.br.topgames.infrastructure.local.entity.Box {
    val box = marcicand.com.br.topgames.infrastructure.local.entity.Box()
    box.large = this.large
    box.medium = this.medium
    box.small = this.small
    box.template = this.template
    return box
}
