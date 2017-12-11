package marcicand.com.br.topgames.infrastructure

import marcicand.com.br.topgames.domain.model.TopGames
import retrofit2.Call
import retrofit2.http.GET

interface Api {

    @GET("kraken/games/top")
    fun getGames() : Call<TopGames>?
}