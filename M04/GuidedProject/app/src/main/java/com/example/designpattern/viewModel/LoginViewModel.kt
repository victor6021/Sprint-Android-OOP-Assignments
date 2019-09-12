package com.example.designpattern.viewModel

import android.text.TextUtils
import android.util.Patterns
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.example.designpattern.BR
import com.example.designpattern.model.User

class LoginViewModel: BaseObservable() {

    private var user: User = User("","")
//  same as above
//            init{
//                user = User("","")
//            }
    private val successMessage = "Login succeeded"
    private val failureMessage = "Login failed"

    @Bindable
    var toastMessage: String? = null
    set(value){
        field = value
        notifyPropertyChanged(BR.toastMessage)
    }

    @Bindable
    fun getUserEmail(): String?{
        return user.email
    }

    @Bindable
    fun getUserPassword(): String?{
        return user.password
    }

    fun setUserEmail(email: String){
        user.email = email
        notifyPropertyChanged(BR.userEmail)
    }

    fun setUserPassword(password:String){
        user.password = password
        notifyPropertyChanged(BR.userPassword)
    }

    fun onLoginClicked(){
        toastMessage = if (isValid()) {
            successMessage
        } else {
            failureMessage
        }
    }

    fun isValid():Boolean{
        return !TextUtils.isEmpty(getUserEmail()) &&
                Patterns.EMAIL_ADDRESS.matcher(getUserEmail()).matches() &&
                (getUserPassword()?.length ?:0) > 7
    }
}