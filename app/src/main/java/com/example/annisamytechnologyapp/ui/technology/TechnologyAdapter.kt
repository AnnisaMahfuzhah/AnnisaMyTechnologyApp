package com.example.annisamytechnologyapp.ui.technology

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.example.annisamytechnologyapp.R
import com.example.annisamytechnologyapp.ui.handphone.HandphoneAdapter
import com.example.annisamytechnologyapp.ui.model.TechnologyList
import com.example.annisamytechnologyapp.ui.model.TechnologyViewModel

class TechnologyAdapter(private val context: Context, private val dataset : List<TechnologyList>) :
    RecyclerView.Adapter<TechnologyAdapter.TechnologyViewHolder>() {

    private val viewModel = TechnologyViewModel()

    class TechnologyViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val button = view.findViewById<Button>(R.id.button_item)
    }

    override fun getItemCount(): Int = dataset.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TechnologyViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_view, parent, false)

        layout.accessibilityDelegate = HandphoneAdapter

        return TechnologyViewHolder(layout)
    }

    override fun onBindViewHolder(holder: TechnologyViewHolder, position: Int) {

        val item = dataset[position]
        holder.button.text = item.toString()

    }
}