package com.example.myapplication2
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var arms: ImageView
    private lateinit var eyes: ImageView
    private lateinit var eyebrows: ImageView
    private lateinit var glasses: ImageView
    private lateinit var nose: ImageView
    private lateinit var mouth: ImageView
    private lateinit var mustache: ImageView
    private lateinit var ears: ImageView
    private lateinit var shoes: ImageView
    private lateinit var hat: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        hat = findViewById(R.id.hat)
        eyes = findViewById(R.id.eyes)
        eyebrows = findViewById(R.id.eyebrows)
        glasses = findViewById(R.id.glasses)
        nose = findViewById(R.id.nose)
        mouth = findViewById(R.id.mouth)
        mustache = findViewById(R.id.mustache)
        ears = findViewById(R.id.ears)
        arms = findViewById(R.id.arms)
        shoes = findViewById(R.id.shoes)

        // Initially, set all parts to be invisible except for potato head
        setAllInvisible()
    }

    fun selectItem(view: View) {
        val checked = (view as CheckBox).isChecked

        when (view.id) {
            R.id.cbHat -> setVisibility(hat, checked)
            R.id.cbEyes -> setVisibility(eyes, checked)
            R.id.cbEyebrows -> setVisibility(eyebrows, checked)
            R.id.cbGlasses -> setVisibility(glasses, checked)
            R.id.cbNose -> setVisibility(nose, checked)
            R.id.cbMouth -> setVisibility(mouth, checked)
            R.id.cbMustache -> setVisibility(mustache, checked)
            R.id.cbEars -> setVisibility(ears, checked)
            R.id.cbArms -> setVisibility(arms, checked)
            R.id.cbShoes -> setVisibility(shoes, checked)
        }
    }

    private fun setVisibility(imageView: ImageView, isVisible: Boolean) {
        if (isVisible) {
            imageView.visibility = View.VISIBLE
        } else {
            imageView.visibility = View.INVISIBLE
        }
    }

    private fun setAllInvisible() {
        hat.visibility = View.INVISIBLE
        eyes.visibility = View.INVISIBLE
        eyebrows.visibility = View.INVISIBLE
        glasses.visibility = View.INVISIBLE
        nose.visibility = View.INVISIBLE
        mouth.visibility = View.INVISIBLE
        mustache.visibility = View.INVISIBLE
        ears.visibility = View.INVISIBLE
        arms.visibility = View.INVISIBLE
        shoes.visibility = View.INVISIBLE
    }
}
