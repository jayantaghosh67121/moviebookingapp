package com.example.mbs01.services;
import com.example.mbs01.entities.Language;
import com.example.mbs01.exceptions.LanguageDetailsNotFoundException;

import java.util.List;

public interface LanguageService {

    public Language acceptLanguageDetails(Language language);
    public Language getLanguageDetails(int id) throws LanguageDetailsNotFoundException;
    public Language getLanguageDetailsByLanguageName(String languageName) throws LanguageDetailsNotFoundException;
    public boolean deleteLanguage(int id) throws LanguageDetailsNotFoundException;
    public List<Language> getAllLanguageDetails();
}
