package com.enterprise.mvvm.viewmodel

import android.os.Handler
import android.os.Looper
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.enterprise.mvvm.model.Product

class ProductViewModel: ViewModel() {

    var resultProduct = MutableLiveData<Product>()

    fun getProduct(name: String){

        var product = Product(name)

        Handler(Looper.getMainLooper()).post {

            resultProduct.value = product

        }

    }

}