package com.lesson_13_hw

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_info.*

class InfoFragment : Fragment(R.layout.fragment_info) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        tv_login.text = arguments?.getString("LOGIN_EXTRA")
        tv_password.text = arguments?.getString("PASSWORD_EXTRA")

        btn_navigate_to_main.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, MainFragment()).commit()


//            val intent = Intent(this, MainActivity::class.java)

//            startActivity(intent)
        }

    }
}
