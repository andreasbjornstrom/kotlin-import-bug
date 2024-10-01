import org.causes.bug.Class2

class Works {
    val causesBug = Class2()
}

class Bug {
    // comment this line to make the test pass
    val causesBug = org.causes.bug.Class2()
}
