package com.zhenchao.myapplication

import android.Manifest
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.tbruyelle.rxpermissions2.RxPermissions
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.setOnClickListener {
            RxPermissions(this).request(Manifest.permission.WRITE_EXTERNAL_STORAGE)
                    .subscribe({ granted ->
                        if (granted) {
                            // All requested permissions are granted
                        } else {
                            // At least one permission is denied
                        }
                    })
        }
    }
}
