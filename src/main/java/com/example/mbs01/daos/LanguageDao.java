package com.example.mbs01.daos;


import com.example.mbs01.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LanguageDao extends JpaRepository<Language, Integer> {
    public Optional<Language> findByLanguageName(String languageName);
}