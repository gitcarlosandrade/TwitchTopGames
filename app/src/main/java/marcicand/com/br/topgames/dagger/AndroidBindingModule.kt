package marcicand.com.br.topgames.dagger

import dagger.Module
import dagger.android.ContributesAndroidInjector
import marcicand.com.br.topgames.presentation.activity.MainActivity

@Module
abstract class AndroidBindingModule {

    @ContributesAndroidInjector(modules = [(MainActivityModule::class)])
    abstract fun buildMainActivity(): MainActivity
}