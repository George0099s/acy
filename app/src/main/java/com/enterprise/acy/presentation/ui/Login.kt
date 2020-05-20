package com.enterprise.acy.presentation.ui

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

import com.enterprise.acy.R
import com.enterprise.acy.presentation.viewmodel.LoginViewModel

class Login : Fragment() {
    private lateinit var login: EditText
    private lateinit var password: EditText
    private lateinit var loginBtn: Button

    companion object {
        fun newInstance() = Login()
    }

    private lateinit var viewModel: LoginViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       val view = inflater.inflate(R.layout.login_fragment, container, false)
        initView(view)
        return view
    }

    private fun initView(view: View) {
        login = view.findViewById(R.id.loginTextField)
        password = view.findViewById(R.id.passwordTextField)
        loginBtn = view.findViewById(R.id.loginBtn)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(LoginViewModel::class.java)
    }
}
