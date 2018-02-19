package com.arudanovsky.videocatalog.view.list.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arudanovsky.videocatalog.R;
import com.arudanovsky.videocatalog.domain.model.Film;

import java.util.List;

/**
 * Created by Мегатрон on 19.02.2018.
 */

public class FilmsAdapter extends RecyclerView.Adapter<FilmsAdapter.FilmHolder> {
    private List<Film> mList;

    public FilmsAdapter (List<Film> list) {
        mList = list;
    }
    @Override
    public FilmHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new FilmHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.film_list_item, parent, false));
    }

    @Override
    public void onBindViewHolder(FilmHolder holder, int position) {
        holder.bindView(mList.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void updateList(List<Film> films) {
        mList = films;
        notifyDataSetChanged();
    }

    class FilmHolder extends RecyclerView.ViewHolder {
        private final TextView textView;
        public FilmHolder(View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text);
        }
        public void bindView(String text) {
            textView.setText(text);
        }
    }
}
