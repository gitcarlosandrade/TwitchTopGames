package marcicand.com.br.topgames.domain.model

data class TopGames(
        val games: List<TopItem>? = listOf(),
        val total: Int = 0
)