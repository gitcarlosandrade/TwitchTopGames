package marcicand.com.br.topgames.domain.usecase

interface UseCase<in PARAMS, out RESPONSE> {
    fun execute(params: PARAMS) : RESPONSE
}