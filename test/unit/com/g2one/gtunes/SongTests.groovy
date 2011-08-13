package com.g2one.gtunes

import grails.test.*

class SongTests extends GrailsUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testMinimumDuration() {
        mockDomain(Song)

        def song = new Song(duration: 0)

        assertFalse('validation should have failed', song.validate())
        assertEquals('min', song.errors.duration)
    }
}
