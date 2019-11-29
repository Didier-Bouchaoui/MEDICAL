package com.example.aidapp.ui.Medicament

import android.support.*
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.aidapp.R
import com.example.aidapp.User
import kotlinx.android.synthetic.main.medicament_layout.view.*

class MedicamentAdapter(
    private val medicamentList: List<User>,
    private val listener: (User) -> Unit
): RecyclerView.Adapter<MedicamentAdapter.ArticleHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = ArticleHolder(
        LayoutInflater.from(parent.context).inflate(R.layout.medicament_layout, parent, false))

    override fun onBindViewHolder(holder: ArticleHolder, position: Int) = holder.bind(medicamentList[position], listener)

    override fun getItemCount() = medicamentList.size

    class ArticleHolder(articleView: View): RecyclerView.ViewHolder(articleView) {

        fun bind(article: User, listener: (User) -> Unit) = with(itemView) {
            Medicament.text = article.name
            Description.text = article.desc
            setOnClickListener { listener(article) }
        }
    }
}