package com.example.quranappv1;

public class Surah {
    private String surahName;
    private String surahNumber;
    private String surahVerseCount;

    public Surah(String surahName, String surahNumber, String surahVerseCount) {
        this.surahName = surahName;
        this.surahNumber = surahNumber;
        this.surahVerseCount = surahVerseCount;
    }

    public String getSurahName() {
        return surahName;
    }

    public void setSurahName(String surahName) {
        this.surahName = surahName;
    }

    public String getSurahNumber() {
        return surahNumber;
    }

    public void setSurahNumber(String surahNumber) {
        this.surahNumber = surahNumber;
    }

    public String getSurahVerseCount() {
        return surahVerseCount;
    }

    public void setSurahVerseCount(String surahVerseCount) {
        this.surahVerseCount = surahVerseCount;
    }
}
