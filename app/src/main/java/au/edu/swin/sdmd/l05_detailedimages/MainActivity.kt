package au.edu.swin.sdmd.l05_detailedimages

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val station = Location("Glenferrie Station", "Ada May Plante",
            -37.821539f, 145.036473f)

        val vStation = findViewById<TextView>(R.id.station)
        vStation.setOnClickListener {
           //setup, target for intent
            var intent = Intent(this, DetailActivity::class.java)
            //add data into our intent
            intent.putExtra("location", station)
            //start activity base on details
            startActivity(intent)

        }

        /*
            //second approach
            var intent = Intent(this, DetailActivity::class.java).apply {

            putExtra("name", station.name)
            putExtra("author", station.author)
        }
        startActivity(intent)
         */


            /*
            //first approach
            intent.putExtra("name", station.name)
            startActivity(intent)
        }
        */

    }


}