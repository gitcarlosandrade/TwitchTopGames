package marcicand.com.br.topgames.infrastructure

import marcicand.com.br.topgames.domain.model.TopGames
import retrofit2.Call

class ApiImpl : Api {

    override fun getGames(): Call<TopGames>? {
        return null
    }
}