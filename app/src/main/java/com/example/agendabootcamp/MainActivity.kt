package com.example.agendabootcamp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.CalendarContract // imports necessarios para a linha 21 para frente
import android.provider.CalendarContract.Events.* // imports necessarios para a linha 21 para frente
import android.widget.Button

class MainActivity : AppCompatActivity() {
    // codigo para adicionar eventos no calendario
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSetEvent = findViewById(R.id.set_event) as Button // as Button é um cast
        //trata evento do botão
        btnSetEvent.setOnClickListener{

            val intent  = Intent(Intent.ACTION_INSERT)
                .setData(CONTENT_URI) // alt+enter para importar o correto
                .putExtra(TITLE,"BootCamp everis")
                .putExtra(EVENT_LOCATION,"Evento online")
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME,System.currentTimeMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, System.currentTimeMillis()+(60*60*1000))

            startActivity(intent)
        }

    }
}