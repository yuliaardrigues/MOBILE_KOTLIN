package com.example.conversor
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

@Suppress("UNREACHABLE_CODE")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
    }

        fun conversor(view: View) {
            val dolar = findViewById<EditText>(R.id.dolar)
            val textResultado = findViewById<TextView>(R.id.textresultado)


            val valorDolarString = dolar.text.toString()
            if (valorDolarString.isEmpty()) {
                textResultado.text = "Por favor, digite um valor em Dólar"
                return
            }


            val valorDolar = try {
                valorDolarString.toDouble()
            } catch (e: NumberFormatException) {
                textResultado.text = "Valor inválido. Digite um número."
                return
            }


            val exchangeRate: Double = 4.93;


            val valorConvertido = valorDolar * exchangeRate
            textResultado.text = "Valor em R$: ${String.format("%.2f", valorConvertido)}"

        }

    }

