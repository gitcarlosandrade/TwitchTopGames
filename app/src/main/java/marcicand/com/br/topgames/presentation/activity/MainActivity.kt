package marcicand.com.br.topgames.presentation.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import marcicand.com.br.topgames.R
import marcicand.com.br.topgames.domain.usecase.InitialDataUseCase
import marcicand.com.br.topgames.infrastructure.ApiImpl
import marcicand.com.br.topgames.infrastructure.local.GamesLocalDataSetImpl
import marcicand.com.br.topgames.infrastructure.remote.GamesRemoteDatasetImpl
import marcicand.com.br.topgames.infrastructure.repository.GamesRepositoryImpl
import marcicand.com.br.topgames.presentation.contract.MainContract
import marcicand.com.br.topgames.presentation.contract.MainPresenterImpl
import marcicand.com.br.topgames.presentation.model.GamesViewModel

class MainActivity : AppCompatActivity(), MainContract.View {

    lateinit var presenter : MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api = ApiImpl()
        val localDataSet = GamesLocalDataSetImpl()
        val remoteDataSet = GamesRemoteDatasetImpl(api = api)
        val repository = GamesRepositoryImpl(localDataSet = localDataSet, remoteDataSet = remoteDataSet)

        presenter = MainPresenterImpl(this, InitialDataUseCase(repository))
        presenter.getInitialData()

    }

    override fun showErrorInitialData(cause: Throwable?) {

    }

    override fun showInitialData(games: GamesViewModel) {

    }
}
