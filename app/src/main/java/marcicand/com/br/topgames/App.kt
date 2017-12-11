package marcicand.com.br.topgames

import android.app.Application
import marcicand.com.br.topgames.infrastructure.local.entity.MyObjectBox


class App : Application() {


    override fun onCreate() {
        super.onCreate()

        val boxStore = MyObjectBox.builder().androidContext(this).build()
    }
}