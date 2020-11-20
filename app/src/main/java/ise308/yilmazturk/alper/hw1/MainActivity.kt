package ise308.yilmazturk.alper.hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.cardview_1.*
import kotlinx.android.synthetic.main.cardview_2.*
import kotlinx.android.synthetic.main.cardview_3.*
import kotlinx.android.synthetic.main.main_layout.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_layout)

        imageButtonCrd1.tag = false
        imageButtonCrd2.tag = false
        imageButtonCrd3.tag = false

        imageButtonCrd1.setOnClickListener(this)
        imageButtonCrd2.setOnClickListener(this)
        imageButtonCrd3.setOnClickListener(this)


    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.imageButtonCrd1 -> {
                if (imageButtonCrd1.tag == false) {
                    imageButtonCrd1.setImageResource(R.drawable.ic_favorite_true)
                    imageButtonCrd1.tag = true
                } else {
                    imageButtonCrd1.setImageResource(R.drawable.ic_favorite_false)
                    imageButtonCrd1.tag = false
                }
            }
            R.id.imageButtonCrd2 -> {
                if (imageButtonCrd2.tag == false) {
                    imageButtonCrd2.setImageResource(R.drawable.ic_favorite_true)
                    imageButtonCrd2.tag = true
                } else {
                    imageButtonCrd2.setImageResource(R.drawable.ic_favorite_false)
                    imageButtonCrd2.tag = false
                }
            }
            R.id.imageButtonCrd3 -> {
                if (imageButtonCrd3.tag == false) {
                    imageButtonCrd3.setImageResource(R.drawable.ic_favorite_true)
                    imageButtonCrd3.tag = true
                } else {
                    imageButtonCrd3.setImageResource(R.drawable.ic_favorite_false)
                    imageButtonCrd3.tag = false
                }
            }
        }
    }
}