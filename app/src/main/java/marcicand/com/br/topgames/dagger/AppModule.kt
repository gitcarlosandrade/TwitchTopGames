package marcicand.com.br.topgames.dagger

import android.content.Context
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import marcicand.com.br.topgames.App
import marcicand.com.br.topgames.infrastructure.Api
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideApi() : Api {
        return Retrofit.Builder()
                .baseUrl("https://api.twitch.tv")
                .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
                .build()
                .create(Api::class.java)
    }

    @Singleton
    @Provides
    fun providesContext(app : App) : Context = app.applicationContext
}