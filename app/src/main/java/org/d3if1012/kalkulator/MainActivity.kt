package org.d3if1012.kalkulator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import org.d3if1012.kalkulator.databinding.ActivityMainBinding

lateinit var bindingmain: ActivityMainBinding
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingmain = ActivityMainBinding.inflate(layoutInflater);
        setContentView(bindingmain.root)
        bindingmain.btnTambah.setOnClickListener(View.OnClickListener {
            if (!bindingmain.ang1.text?.isEmpty()!! && !bindingmain.ang2.text?.isEmpty()!!) {
                var tambah =
                    bindingmain.ang1.text.toString().toInt() + bindingmain.ang2.text.toString()
                        .toInt()
                Toast.makeText(applicationContext, "Hasil = " + tambah, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
            }
        })
        bindingmain.btnKurang.setOnClickListener(View.OnClickListener {
            if (!bindingmain.ang1.text?.isEmpty()!! && !bindingmain.ang2.text?.isEmpty()!!) {
                var kurang =
                    bindingmain.ang1.text.toString().toInt() - bindingmain.ang2.text.toString().toInt()
                Toast.makeText(applicationContext, "Hasil = " + kurang, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
            }
        })
        bindingmain.btnBagi.setOnClickListener(View.OnClickListener {
            if (!bindingmain.ang1.text?.isEmpty()!! && !bindingmain.ang2.text?.isEmpty()!!) {
                var bagi =
                    bindingmain.ang1.text.toString().toInt() / bindingmain.ang2.text.toString().toInt()
                Toast.makeText(applicationContext, "Hasil = " + bagi, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
            }
        })
        bindingmain.btnKali.setOnClickListener(View.OnClickListener {
            if (!bindingmain.ang1.text?.isEmpty()!! && !bindingmain.ang2.text?.isEmpty()!!) {
                var kali =
                    bindingmain.ang1.text.toString().toInt() * bindingmain.ang2.text.toString().toInt()
                Toast.makeText(applicationContext, "Hasil = " + kali, Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(applicationContext, "Kolom tidak boleh kosong", Toast.LENGTH_SHORT).show();
            }
        })
    }

}