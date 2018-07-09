package marcicand.com.br.topgames.dagger

import dagger.Subcomponent
import dagger.android.AndroidInjector
import marcicand.com.br.topgames.presentation.activity.MainActivity

@Subcomponent(modules = [])
interface MainActivityComponent : AndroidInjector<MainActivity>{

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector.Builder<MainActivity>()

}