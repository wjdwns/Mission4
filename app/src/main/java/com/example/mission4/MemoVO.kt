package com.example.mission4

import io.realm.RealmObject

class MemoVo : RealmObject() {
    var name: String? = null
    var phone: String? = null
    var email: String? = null
}