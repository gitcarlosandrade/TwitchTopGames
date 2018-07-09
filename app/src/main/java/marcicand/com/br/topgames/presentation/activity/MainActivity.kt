package marcicand.com.br.topgames.presentation.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import dagger.android.AndroidInjection
import marcicand.com.br.topgames.R
import marcicand.com.br.topgames.presentation.contract.MainContract
import marcicand.com.br.topgames.presentation.model.GamesViewModel
import javax.inject.Inject

class MainActivity : AppCompatActivity(), MainContract.View {

    @Inject lateinit var presenter : MainContract.Presenter

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter.subscribe()

    }

    override fun showMessage(s: String) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show()
    }

    override fun showErrorInitialData(cause: Throwable?) {

    }

    override fun showInitialData(games: GamesViewModel) {

    }
}
