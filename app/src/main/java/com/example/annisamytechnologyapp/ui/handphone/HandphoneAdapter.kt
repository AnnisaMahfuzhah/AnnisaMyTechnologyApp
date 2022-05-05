package com.example.annisamytechnologyapp.ui.handphone

import android.graphics.Path
import android.os.Build
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.accessibility.AccessibilityNodeInfo
import android.widget.Button
import androidx.annotation.RequiresApi
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.annisamytechnologyapp.R

class HandphoneAdapter :
    RecyclerView.Adapter<HandphoneAdapter.HandphoneViewHolder>() {

    private val list = (1).rangeTo(4).toList()

    class HandphoneViewHolder(val view : View) : RecyclerView.ViewHolder(view)
    {
        val button = view.findViewById<Button>(R.id.button_item)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HandphoneViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_view, parent, false)

        layout.accessibilityDelegate = Accessibility
        return HandphoneViewHolder(layout)
    }

    override fun onBindViewHolder(holder: HandphoneViewHolder, position: Int) {
        val item = list.get(position)
        holder.button.text = item.toString()

        holder.button.setOnClickListener {
//            val action = HandphoneFragmeantDirection.actionHandphoneFragmentToTechnologyFragment()
//            holder.view.findNavController().navigate(action)
        }
    }

    companion object Accessibility : View.AccessibilityDelegate() {
        @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
        override fun onInitializeAccessibilityNodeInfo(
            host: View?,
            info: AccessibilityNodeInfo?
        ) {
            super.onInitializeAccessibilityNodeInfo(host, info)
            val customString = host?.context?.getString(R.string.menu_home)
            val customClick =
                AccessibilityNodeInfo.AccessibilityAction(
                    AccessibilityNodeInfo.ACTION_CLICK,
                    customString
                )
            info?.addAction(customClick)
        }
    }
}