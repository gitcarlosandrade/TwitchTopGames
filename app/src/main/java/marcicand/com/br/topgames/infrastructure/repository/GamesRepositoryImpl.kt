package marcicand.com.br.topgames.infrastructure.repository

import io.reactivex.Maybe
import marcicand.com.br.topgames.domain.model.TopGames
import marcicand.com.br.topgames.infrastructure.local.GamesLocalDataSet
import marcicand.com.br.topgames.infrastructure.remote.GamesRemoteDataSet

class GamesRepositoryImpl(var localDataSet: GamesLocalDataSet,
                          var remoteDataSet: GamesRemoteDataSet) : GamesRepository {

    override fun getInitialData(): Maybe<TopGames> {

        return localDataSet.getInitialGames().doOnError {
            remoteDataSet.getInitialGames().doOnSuccess {
                localDataSet.save(it)
            }
        }
    }
}