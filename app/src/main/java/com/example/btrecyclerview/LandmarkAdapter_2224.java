package com.example.btrecyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandmarkAdapter_2224 extends RecyclerView.Adapter<LandmarkAdapter_2224.LandmarkViewHolder_2224> {

    ArrayList<Landmark_2224> landmarkList_2224;
    Context context_2224;
    RecyclerViewClickListener_2224 listener_2224;

    public LandmarkAdapter_2224(ArrayList<Landmark_2224> landmarkList_2224, Context context_2224, RecyclerViewClickListener_2224 listener_2224) {
        this.landmarkList_2224 = landmarkList_2224;
        this.context_2224 = context_2224;
        this.listener_2224 = listener_2224;
    }

    @NonNull
    @Override
    public LandmarkViewHolder_2224 onCreateViewHolder(@NonNull ViewGroup parent_2224, int viewType_2224) {

        View view_2224 = LayoutInflater.from(parent_2224.getContext()).inflate(R.layout.list_item_landmark_2224, parent_2224, false);
        return new LandmarkViewHolder_2224(view_2224, listener_2224);
    }

    @Override
    public void onBindViewHolder(@NonNull LandmarkViewHolder_2224 holder_2224, int position_2224) {

        Landmark_2224 landmark_2224 = landmarkList_2224.get(position_2224);

        holder_2224.textViewName_2224.setText(landmark_2224.getName_2224());
        holder_2224.textViewLocation_2224.setText(landmark_2224.getLocation_2224());
        holder_2224.imageViewLandmark_2224.setImageResource(landmark_2224.getImageResource_2224());
    }

    @Override
    public int getItemCount() {
        return landmarkList_2224.size();
    }

    public static class LandmarkViewHolder_2224 extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageViewLandmark_2224;
        TextView textViewName_2224;
        TextView textViewLocation_2224;
        ImageView imageViewArrow_2224;
        RecyclerViewClickListener_2224 listener_2224; // Biến listener cục bộ

        public LandmarkViewHolder_2224(@NonNull View itemView_2224, RecyclerViewClickListener_2224 listener_2224) {
            super(itemView_2224);
            imageViewLandmark_2224 = itemView_2224.findViewById(R.id.imageViewLandmark_2224);
            textViewName_2224 = itemView_2224.findViewById(R.id.textViewName_2224);
            textViewLocation_2224 = itemView_2224.findViewById(R.id.textViewLocation_2224);
            imageViewArrow_2224 = itemView_2224.findViewById(R.id.imageViewArrow_2224);

            this.listener_2224 = listener_2224;

            itemView_2224.setOnClickListener(this);
        }

        @Override
        public void onClick(View view_2224) {
            if (listener_2224 != null) {
                listener_2224.onItemClick_2224(getAdapterPosition());
            }
        }
    }
}