package com.lesson_13_hw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        btn_login.setOnClickListener {
            val fragment = InfoFragment()

            val bundle = Bundle()
            bundle.putString("LOGIN_EXTRA", et_login.text.toString())
            bundle.putString("PASSWORD_EXTRA", et_password.text.toString())

            fragment.arguments = bundle

            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment).commit()
        }
    }
}

//val intent - Intent(this, InfoActivity::class.java)
//intent.putExtra("LOGIN_EXTRA", et_login.text.toString())
//intent.putExtra("PASSWORD_EXTRA", et_password.text.toString())
//startActivity(intent)