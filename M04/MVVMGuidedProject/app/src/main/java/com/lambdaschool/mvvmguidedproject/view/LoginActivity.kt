package com.lambdaschool.mvvmguidedproject.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.databinding.BindingAdapter
import androidx.databinding.DataBindingUtil
import com.lambdaschool.mvvmguidedproject.R
import com.lambdaschool.mvvmguidedproject.databinding.ActivityLoginBinding
import com.lambdaschool.mvvmguidedproject.viewmodel.LoginViewModel

class LoginActivity : AppCompatActivity() {

//    private val viewModel = LoginViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityLoginBinding>(this, R.layout.activity_login)
        binding.viewModel = LoginViewModel()
        binding.executePendingBindings()
    }

    companion object {
        @BindingAdapter("toastMessage")
        @JvmStatic
        fun showToast(view: View, message: String?) {
            message?.let {
                Toast.makeText(view.context, it, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
