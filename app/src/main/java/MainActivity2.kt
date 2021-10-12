import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.reddit.R
import com.squareup.picasso.Picasso


class MainActivity2 : AppCompatActivity() {
    private val textView2: TextView? = null
    private val textView3: TextView? = null
    private var imageView3: ImageView? = null
    var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button = findViewById(R.id.button)
        imageView3 = findViewById(R.id.imageView3)

        // textView2.setText(getIntent().getStringExtra("url"));
        Picasso.get().load(intent.getStringExtra("url")).into(imageView3)
    }
}