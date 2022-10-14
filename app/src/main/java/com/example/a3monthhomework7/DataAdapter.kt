package com.example.a3monthhomework7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a3monthhomework7.databinding.DataItemBinding
import com.squareup.picasso.Picasso

class DataAdapter(private val data: ArrayList<UserData>,private val onclickListener: MyOnclickListener) :
    RecyclerView.Adapter<DataAdapter.DataViewHolder>()
{


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        return DataViewHolder(
            DataItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.bind(data.get(position))
        holder.itemView.setOnClickListener{
            onclickListener.onClicked(data.get(position))
        }

    }

    override fun getItemCount(): Int {
        return data.size
    }

    inner class DataViewHolder(private val binding: DataItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: UserData) {
            binding.tvName.text = data.toString()
            binding.tvName.text = (data.name)
            binding.tvSurname.text = (data.surName)
            binding.tvAge.text = (data.age)
            val imageTarget = data.image
            Picasso.get().load(imageTarget).into(binding.imageView)


        }

    }
}