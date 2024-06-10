package by.vjacheslavkovalenko.notesapptms

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
//Commit N3. Add Screen 31. And all is working.
//Commit N4. Add Screen 36. Add transitions. And all is working.
//Commit N5. For test.
//Commit N6. For me. Draft!
//Commit N7. For check. Homework No. 16.
//Commit N8. New Branch for check. Homework No. 16.