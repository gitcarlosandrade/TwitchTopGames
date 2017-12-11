package marcicand.com.br.topgames.infrastructure.model

import com.google.gson.annotations.SerializedName

data class TopGames(
        val top: List<TopItem>?,
        @SerializedName("_total") val total: Int = 0)