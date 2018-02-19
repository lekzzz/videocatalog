package com.arudanovsky.videocatalog.view.list.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.arudanovsky.videocatalog.R;
import com.arudanovsky.videocatalog.domain.model.Film;
import com.squareup.picasso.Picasso;

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
        holder.bindView(mList.get(position));
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
        private final ImageView poster;
        private final TextView title;
        private final TextView description;
        private final TextView vote;
        public FilmHolder(View itemView) {
            super(itemView);
            poster = itemView.findViewById(R.id.poster_image);
            title = itemView.findViewById(R.id.title);
            description = itemView.findViewById(R.id.description);
            vote = itemView.findViewById(R.id.vote);
        }
        public void bindView(Film film) {
            title.setText(film.getTitle());
            description.setText(film.getOverview());
            vote.setText("Average vote: " + film.getVoteAverage().toString() + "/10");
            Picasso.with(poster.getContext()).load(film.getPosterPath())
                    .placeholder(R.drawable.ic_launcher_background).into(poster);
        }
    }
}
