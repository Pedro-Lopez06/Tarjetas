package lopez.pedro.tarjetas

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.airbnb.lottie.LottieAnimationView

class ResultActivity : AppCompatActivity() {
    lateinit var animView:LottieAnimationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado)

        animView = findViewById(R.id.animation_view)


        val extras = intent.extras
        val rescuesCorrect = extras!!.getBoolean("respect")
        try {
            animView.setAnimation(R.raw.wrongnotif)
        }catch (e:Exception){
            Log.e("lottie",e.localizedMessage)
        }

        animView.setAnimation(R.raw.wrongnotif)
        if (rescuesCorrect){
            animView.setAnimation(R.raw.success)
        }else{
            animView.setAnimation(R.raw.wrongnotif)
        }
    }
}