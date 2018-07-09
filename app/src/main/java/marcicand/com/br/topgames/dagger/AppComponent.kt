package marcicand.com.br.topgames.dagger

import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import marcicand.com.br.topgames.App


@Component(modules = [
    AndroidSupportInjectionModule::class,
    AndroidBindingModule::class,
    MainActivityModule::class,
    AppModule::class
])
interface AppComponent : AndroidInjector<App>{

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}