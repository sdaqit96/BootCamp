package com.StSystem.repository;

import com.StSystem.entity.FootballMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
public interface FootballRepository extends JpaRepository<FootballMatch, Integer> {

    public boolean existsByDate(String date);

    public List<FootballMatch> findByDate(String date);

    @Query("select max(s.id) from FootballMatch s")
    public Integer findMaxId();
}
