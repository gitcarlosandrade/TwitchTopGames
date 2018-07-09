package marcicand.com.br.topgames.dagger

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap
import marcicand.com.br.topgames.presentation.activity.MainActivity

@Module(subcomponents = [MainActivityComponent::class])
abstract class MainActivityModule{

    @Binds
    @IntoMap
    @ActivityKey(MainActivity::class)
    abstract fun bindMainActivityInjectorFactory(builder : MainActivityComponent.Builder)
            : AndroidInjector.Factory<Activity>
}