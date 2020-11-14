package com.example.listjajanankekiniansby

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.detail_jajanan.*

class DetailJajanan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_jajanan)
        var IntentStart = getIntent()

        if (IntentStart.hasExtra(Intent.EXTRA_TEXT)) {
            var gmbr = IntentStart.getIntExtra(Intent.EXTRA_TEXT, 0)
            var namaJ = IntentStart.getStringExtra(Intent.EXTRA_TITLE)
            var desJ = IntentStart.getStringExtra(Intent.EXTRA_TEMPLATE)
            DetailGambar.setImageResource(gmbr)
            DesNama.text = namaJ
            DesJajan.text = desJ
        }
    }
}