package com.healthtracker.healthTracker;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DiaryRepo extends JpaRepository<Entry, Long> {

}
