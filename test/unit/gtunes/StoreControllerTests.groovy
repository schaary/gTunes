package gtunes

import grails.test.*

class StoreControllerTests extends ControllerUnitTestCase {
    protected void setUp() {
        super.setUp()
    }

    protected void tearDown() {
        super.tearDown()
    }

    void testRenderHomepage() {
        controller.index()
        assertEquals "Welcome to the gTunes Store!",
            controller.response.contentAsString

    }
}
