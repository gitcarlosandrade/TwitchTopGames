package marcicand.com.br.topgames.domain

import io.reactivex.Maybe
import marcicand.com.br.topgames.domain.usecase.UseCase

class ExecutorImpl : Executor {

    override fun <PARAMS, RESPONSE>
            execute(useCase: UseCase<PARAMS, Maybe<RESPONSE>>, params: PARAMS) : Maybe<RESPONSE> =
            useCase.execute(params = params)
}