package com.example.businesscard

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Wire up share button to share the visible contact details via Android share sheet
        val shareButton: Button? = findViewById(R.id.share_button)
        val fullName: TextView? = findViewById(R.id.full_name)
        val jobTitle: TextView? = findViewById(R.id.job_title)
        val company: TextView? = findViewById(R.id.company_name)
        val phone: TextView? = findViewById(R.id.phone_number)
        val email: TextView? = findViewById(R.id.email_address)

        shareButton?.setOnClickListener {
            val shareText = StringBuilder().apply {
                append(fullName?.text ?: "")
                append("\n")
                append(jobTitle?.text ?: "")
                if (!company?.text.isNullOrEmpty()) {
                    append(" at ")
                    append(company?.text ?: "")
                }
                append("\n")
                append("Phone: ")
                append(phone?.text ?: "")
                append("\n")
                append("Email: ")
                append(email?.text ?: "")
            }.toString()

            val intent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(Intent.EXTRA_SUBJECT, "Contact: ${fullName?.text}")
                putExtra(Intent.EXTRA_TEXT, shareText)
            }
            startActivity(Intent.createChooser(intent, getString(R.string.share_via)))
        }
    }
}

