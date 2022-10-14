package com.example.a3monthhomework7

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

fun AppCompatActivity.addFragment(fragment: Fragment){
supportFragmentManager.beginTransaction().add(R.id.conteyner,fragment).commit()
}

fun Fragment.replaceFragment(fragment: Fragment){
    requireActivity().supportFragmentManager.beginTransaction()
        .replace(R.id.conteyner,fragment).commit()

}