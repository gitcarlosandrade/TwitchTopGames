package marcicand.com.br.topgames

import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import marcicand.com.br.topgames.dagger.AppComponent


class App : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<out DaggerApplication>
            = DaggerAppComponent.builder().create(this)

}