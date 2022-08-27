package com.enterprise.mvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.enterprise.mvvm.viewmodel.ProductViewModel

class MainActivity : AppCompatActivity() {

    private var productViewModel: ProductViewModel? = null

    private var textViewOutput: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        productViewModel = ViewModelProvider(this)[ProductViewModel::class.java]

        textViewOutput = findViewById(R.id.textViewOutput)

        productViewModel?.resultProduct?.observe(this){ product ->

            textViewOutput?.text = product.name

        }

        var outputStr = "Test Successful!"
        productViewModel?.getProduct(outputStr)

    }

}