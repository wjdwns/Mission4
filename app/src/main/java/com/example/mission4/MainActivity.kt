package com.example.mission4

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        add_btn.setOnClickListener(){
            val name = name_add.toString()
            val phone = phone_add.toString()
            val email = email_add.toString()

            Realm.init(this)
            val mRealm=Realm.getDefaultInstance()


            mRealm.executeTransaction { realm ->
                val vo = realm.createObject(MemoVo::class.java)
                vo.name = name
                vo.phone = phone
                vo.email = email
            }
        }
    }

    fun maketoast() {
        val toast = Toast.makeText(this, "이름이 입력되지 않았습니다.", Toast.LENGTH_SHORT)
        toast.show()
    }

}