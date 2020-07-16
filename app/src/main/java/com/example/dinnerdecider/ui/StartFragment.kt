package com.example.dinnerdecider.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import androidx.navigation.fragment.NavHostFragment
import com.example.dinnerdecider.R

class StartFragment : Fragment() {
    private var btnStart: Button? = null
    private var btnSettings: ImageButton? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v :View = inflater.inflate(R.layout.fragment_start, container, false)
        btnStart = v.findViewById(R.id.btn_start)
        btnSettings = v.findViewById(R.id.btn_settings)
        btnStart!!.setOnClickListener{
            NavHostFragment.findNavController(this).navigate(R.id.action_startFragment_to_chooseType)
        }
        btnSettings!!.setOnClickListener {
            NavHostFragment.findNavController(this).navigate(R.id.action_startFragment_to_settings)
        }
        return v
    }

}