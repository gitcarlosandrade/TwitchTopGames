package marcicand.com.br.topgames.infrastructure.model

import com.google.gson.annotations.SerializedName

data class Game(
        @SerializedName("_id") val id: Int = 0,
        @SerializedName("localized_name") val localizedName: String = "",
        val popularity: Int = 0,
        val name: String = "",
        val logo: Logo?,
        val box: Box?,
        val locale: String = ""
)
