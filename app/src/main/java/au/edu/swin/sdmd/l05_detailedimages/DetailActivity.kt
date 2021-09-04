package au.edu.swin.sdmd.l05_detailedimages

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //get data or retrieve activity
        val location = intent.getParcelableExtra<Location>("location")

        //null check
        location?.let {
        val vName = findViewById<TextView>(R.id.name)
        vName.text = it.name

        val vAuthor = findViewById<TextView>(R.id.author)
        vAuthor.text = it.author

        }



        /*
        val vName = findViewById<TextView>(R.id.name)
        val name = intent.getStringExtra("name")
        vName.text = name

        val vAuthor = findViewById<TextView>(R.id.author)
        val author = intent.getStringExtra("author")
        vAuthor.text = author

         */

    }
}