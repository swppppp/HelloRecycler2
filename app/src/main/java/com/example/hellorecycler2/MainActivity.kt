package com.example.hellorecycler2

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.observe
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val vm: MainActivityViewmodel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vm.listData.observe(this) {
            val recyclerList = findViewById<RecyclerView>(R.id.recycler_list)
            recyclerList.adapter = MyAdapter(it)

            Log.w("-----","dataUsed-----")
        }
    }
}

class MyAdapter(private val dataList: List<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.recycler_item, parent, false)
        return MyViewHolder(itemView)
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textview = itemView.findViewById<TextView>(R.id.text_view)
    }

    override fun getItemCount() = dataList.size


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textview.text = dataList[position]
    }

}
