package lopez.pedro.tarjetas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class PracticaActivity : AppCompatActivity() {
    var factor1:Int = 0
    var factor2:Int = 0
    var producto:Int = 0
    lateinit var tvFactor1:TextView
    lateinit var tvFactor2:TextView
    lateinit var etResultado:EditText
    lateinit var btnVerificar:Button
    var respuestaCorrecta = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practica)
        initUI()

        btnVerificar.setOnClickListener{
            val resultado=etResultado.text.toString()
            if (resultado.equals("")){

            }else{
                respuestaCorrecta = producto == resultado.toInt()
                generarMultiplicacion()
                val mostrarResultado = Intent(this, ResultActivity::class.java)
                mostrarResultado.putExtra("respuesta",respuestaCorrecta)
                startActivity(mostrarResultado)
            }
        }

    }
    fun initUI(){
        tvFactor1=findViewById(R.id.factor1)
        tvFactor2=findViewById(R.id.factor2)
        etResultado=findViewById(R.id.producto)
        btnVerificar=findViewById(R.id.btnVerificar)
        generarMultiplicacion()

    }
    fun generarMultiplicacion(){
        factor1 = Random.nextInt(0,10)
        factor2 = Random.nextInt(0,10)
        producto = factor1*factor2

        tvFactor1.text = "$factor1"
        tvFactor2.text = "$factor2"
        etResultado.text.clear()
    }
}