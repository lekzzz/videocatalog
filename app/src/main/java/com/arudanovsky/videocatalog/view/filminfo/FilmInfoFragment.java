package com.arudanovsky.videocatalog.view.filminfo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.arudanovsky.videocatalog.R;
import com.arudanovsky.videocatalog.domain.model.Film;
import com.arudanovsky.videocatalog.domain.model.Genre;
import com.arudanovsky.videocatalog.view.common.BaseFragment;
import com.squareup.picasso.Picasso;

import java.math.BigDecimal;
import java.util.List;

import cn.jzvd.JZVideoPlayerStandard;

/**
 * Created by RUDANOVSKIYAA on 19.02.2018.
 */

public class FilmInfoFragment extends BaseFragment<FilmInfoActivity> implements FilmInfoProtocol.FilmInfoView {
    private FilmInfoProtocol.FilmInfoPresenter mPresenter;
    private JZVideoPlayerStandard mPlayer;
    private TextView mTitle, mOverview, mAvgVote, mVotesCount, mGenres;

    public static FilmInfoFragment newInstance(Film film) {
        FilmInfoFragment filmInfoFragment = new FilmInfoFragment();
        Bundle arg = new Bundle();
        arg.putSerializable(FilmInfoActivity.EXTRA_FILM, film);
        filmInfoFragment.setArguments(arg);
        return filmInfoFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Film film = null;
        if (getArguments() != null)
            film = (Film) getArguments().getSerializable(FilmInfoActivity.EXTRA_FILM);
        mPresenter = new FilmInfoFragmentPresenter(film);
        mPresenter.onCreate(this);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_film_info, container, false);
        mPlayer = view.findViewById(R.id.videoplayer);
        mTitle = view.findViewById(R.id.film_title);
        mAvgVote = view.findViewById(R.id.film_avg_vote);
        mVotesCount = view.findViewById(R.id.film_votes_count);
        mOverview = view.findViewById(R.id.film_overview);
        mGenres = view.findViewById(R.id.film_genres);
        mPresenter.subscribe();
        return view;
    }

    @Override
    public void populateView(Film film) {
        mPlayer.setUp(film.getVideo()
                , JZVideoPlayerStandard.SCREEN_WINDOW_NORMAL, "trailer");
        Picasso.with(getContext()).load(film.getPosterPath()).into(mPlayer.thumbImageView);
        mTitle.setText(film.getTitle());
        mOverview.setText(film.getOverview());
        mVotesCount.setText("Votes: " + film.getVoteCount());
        setGenres(film.getGenres());
        setAvgVote(film.getVoteAverage());
    }

    private void setAvgVote(BigDecimal voteAverage) {
        if (voteAverage.compareTo(new BigDecimal(5)) < 0)
            mAvgVote.setTextColor(Color.RED);
        else if (voteAverage.compareTo(new BigDecimal(7)) >= 0)
            mAvgVote.setTextColor(Color.GREEN);
        mAvgVote.setText(voteAverage.toString() + "/10");
    }

    private void setGenres(List<Genre> genres) {
        StringBuilder builder = new StringBuilder("Genres: ");
        if (genres != null && !genres.isEmpty()) {
            for (int i = 0; i < genres.size(); i++) {
                builder.append(genres.get(i).getName());
                if (i != genres.size() - 1)
                    builder.append(", ");
            }
            mGenres.setText(builder.toString());
        }
    }
}
