package marcicand.com.br.topgames.presentation.model

data class GamesViewModel(
        val total: Int?,
        val games: List<Game>?)

data class Game(
        val id: Int?,
        val name: String?,
        val image: String?)