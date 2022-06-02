package com.mikebrunette401.songr.repositories;
import com.mikebrunette401.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;
public interface AlbumRepository extends JpaRepository <Album, Long> {
    Album findByTitle(String title);
}
