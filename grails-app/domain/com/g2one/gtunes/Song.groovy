package com.g2one.gtunes

class Song {
    String title
    String artist
    Integer duration

    Album album
    static constraints = {
        duration(min: 1)
    }
}
