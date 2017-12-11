package marcicand.com.br.topgames.domain.model

import marcicand.com.br.topgames.infrastructure.model.Box
import marcicand.com.br.topgames.infrastructure.model.Logo

data class Game(
        val id: Int = 0,
        val localizedName: String = "",
        val popularity: Int = 0,
        val name: String = "",
        val logo: Logo?,
        val box: Box?,
        val locale: String = ""
)
