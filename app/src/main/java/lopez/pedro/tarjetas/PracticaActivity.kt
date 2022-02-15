package lopez.pedro.tarjetas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class PracticaActivity : AppCompatActivity() {
    var factor1:Int = 0
    var factor2:Int = 0
    var producto:Int = 0
    lateinit var vtFactor1:TextView
    lateinit var vtFactor2:TextView
    lateinit var etResultado:EditText
    lateinit var btnVerificar:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practica)
        vtFactor1=findViewById(R.id.factor1)
        vtFactor2=findViewById(R.id.factor2)
        etResultado=findViewById(R.id.producto)
        btnVerificar=findViewById(R.id.btnVerificar)

        generarMultiplicacion()

        btnVerificar.setOnClickListener{
            var resultado=etResultado.text.toString()
            if (resultado.isNotEmpty()){
                var respuestaUsuario = resultado.toInt()
                if (respuestaUsuario == producto){
                    //Correcto
                }else{
                    //Incorrecto
                }
            }
        }

    }
    fun generarMultiplicacion(){
        factor1 = Random.nextInt(0,10)
        factor2 = Random.nextInt(0,10)

        producto = factor1*factor2
    }
}