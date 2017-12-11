package marcicand.com.br.topgames.domain.model

data class TopItem(val game: Game,
                   val viewers: Int = 0,
                   val channels: Int = 0)