class Testcase:
    def __init__(self, name):
        self.name = name

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def run(self):
        self.setUp()
        method = getattr(self, self.name)
        method()
        self.tearDown()


class WasRun(Testcase):
    def setUp(self):
        self.log = "setUp "

    def testMethod(self):
        self.log = self.log+"testMethod "

    def tearDown(self):
        self.log = self.log+"tearDown "


class TestCaseTest(Testcase):
    def testTemplateMethod(self):
        test = WasRun("testMethod")
        test.run()
        assert("setUp testMethod tearDown " == test.log)


TestCaseTest("testTemplateMethod").run()
