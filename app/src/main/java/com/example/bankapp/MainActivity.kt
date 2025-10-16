package com.example.bankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val bankPlans = listOf(
            BankPlan("وام خرید کالا", "وامی برای خرید لوازم خانگی و کالاهای دیجیتال"),
            BankPlan("سپرده جوانان", "سپرده‌گذاری با سود ویژه برای آینده جوانان"),
            BankPlan("تسهیلات مسکن", "وام برای خرید یا ساخت مسکن"),
            BankPlan("وام ازدواج", "تسهیلات قرض‌الحسنه برای زوج‌های جوان"),
            BankPlan("طرح سپرده ممتاز", "سود بیشتر با سپرده‌گذاری بلندمدت")
        )

        recyclerView.adapter = BankPlanAdapter(bankPlans)
    }
}