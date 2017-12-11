package marcicand.com.br.topgames.domain

import io.reactivex.Maybe
import marcicand.com.br.topgames.domain.usecase.UseCase

interface Executor {
    fun <PARAMS, RESPONSE> execute(useCase: UseCase<PARAMS, Maybe<RESPONSE>>, params : PARAMS) : Maybe<RESPONSE>
}