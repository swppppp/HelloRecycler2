package com.example.source

class DataRepository {

    companion object {
        fun getList100(): List<String> {
            var list = ArrayList<String>(100)
            for (i in 0..99) {
                list.add(i.toString())
            }
            return list
        }
    }


}