package com.example.bankapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class BankPlan(val title: String, val description: String)

class BankPlanAdapter(private val bankPlans: List<BankPlan>) :
    RecyclerView.Adapter<BankPlanAdapter.BankPlanViewHolder>() {

    class BankPlanViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
        val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BankPlanViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_bank_plan, parent, false)
        return BankPlanViewHolder(view)
    }

    override fun onBindViewHolder(holder: BankPlanViewHolder, position: Int) {
        val bankPlan = bankPlans[position]
        holder.titleTextView.text = bankPlan.title
        holder.descriptionTextView.text = bankPlan.description
    }

    override fun getItemCount() = bankPlans.size
}