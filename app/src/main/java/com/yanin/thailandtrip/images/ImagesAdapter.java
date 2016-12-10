package com.yanin.thailandtrip.images;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.yanin.thailandtrip.R;

import java.util.ArrayList;
import java.util.List;

class ImagesAdapter extends RecyclerView.Adapter<ImagesAdapter.ViewHolder> {

    private List<String> imageUrls = new ArrayList<>();
    private OnItemClickListener onItemClickListener;
    private Context context;

    ImagesAdapter(Context context) {
        this.context = context;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public void setUsers(List<String> imageUrls){
        this.imageUrls = imageUrls;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemLayoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image, parent, false);

        return new ViewHolder(itemLayoutView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        String imageUrl = imageUrls.get(position);

        holder.itemView.setTag(imageUrl);

        Glide.with(context)
                .load(imageUrl)
                .into(holder.imageThumb);
    }

    @Override
    public int getItemCount() {
        return imageUrls.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{

        private ImageView imageThumb;

        ViewHolder(View itemView) {
            super(itemView);

            imageThumb = (ImageView) itemView.findViewById(R.id.imageThumb);
        }
    }

    private View.OnClickListener onImageClickListener = new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            String url = (String) v.getTag();
            ImageView imageAvatar = (ImageView) v.findViewById(R.id.imageThumb);

            onItemClickListener.onItemClick(url, imageAvatar);
        }
    };

    interface OnItemClickListener{
        void onItemClick(String url, View view);
    }

}
