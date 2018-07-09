package marcicand.com.br.topgames.domain.usecase

import io.reactivex.Maybe
import marcicand.com.br.topgames.domain.model.TopGames
import marcicand.com.br.topgames.infrastructure.repository.GamesRepository

class InitialDataUseCase(var repository : GamesRepository) : UseCase<Unit, Maybe<TopGames>> {

    override fun execute(params: Unit): Maybe<TopGames> {

        return repository.getInitialData()
    }
}