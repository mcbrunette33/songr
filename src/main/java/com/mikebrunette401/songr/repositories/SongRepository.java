package com.mikebrunette401.songr.repositories;

import com.mikebrunette401.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
