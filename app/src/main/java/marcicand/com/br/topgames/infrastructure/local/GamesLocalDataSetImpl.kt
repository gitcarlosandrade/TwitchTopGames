package marcicand.com.br.topgames.infrastructure.local

import io.objectbox.BoxStore
import io.reactivex.Maybe
import marcicand.com.br.topgames.domain.model.TopGames
import marcicand.com.br.topgames.infrastructure.local.entity.Game
import marcicand.com.br.topgames.infrastructure.model.Logo
import javax.inject.Inject
import javax.inject.Provider

class GamesLocalDataSetImpl @Inject constructor(var boxStore: Provider<BoxStore>) : GamesLocalDataSet {

    override fun getInitialGames(): Maybe<TopGames> {
        return Maybe.just(TopGames())
    }

    override fun save(it: TopGames) {
//        val entity = boxStore.get().boxFor(Game::class.java)
//        val game = Game()
//        it.games?.map {
//            game.box.target = it.game.box?.toEntity()
//            game.logo.target = it.game.logo?.toEntity()
//            game.id = it.game.id.toLong()
//            game.locale = it.game.locale
//            game.name = it.game.name
//            game.localizedName = it.game.localizedName
//            game.popularity = it.game.popularity
//
//        }
//        entity.put(game)
    }
}

private fun Logo.toEntity(): Logo {
    val logo = Logo()
    logo.large = this.large
    logo.medium = this.medium
    logo.small = this.small
    logo.template = this.template
    return logo
}

private fun marcicand.com.br.topgames.infrastructure.model.Box.toEntity() : marcicand.com.br.topgames.infrastructure.model.Box {
    val box = marcicand.com.br.topgames.infrastructure.model.Box()
    box.large = this.large
    box.medium = this.medium
    box.small = this.small
    box.template = this.template
    return box
}
