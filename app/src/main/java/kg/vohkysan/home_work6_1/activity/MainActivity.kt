package kg.vohkysan.home_work6_1.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dagger.hilt.android.AndroidEntryPoint
import kg.vohkysan.home_work6_1.R
import kg.vohkysan.home_work6_1.databinding.ActivityMainBinding

/*На первой активити добавить EditText + Button, при вводе если значения
    в editText пустое и вы нажали на button, то отобразить Toast, что EditText
    не может быть пустым, иначе Перейти на вторую активити и отобразить значение
    в EditText, также добавить Button, если EditText не пуст, то вернуться на 1
    активити и отобразить текст из 2 активити.(использовать registerForActivity)*/

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}