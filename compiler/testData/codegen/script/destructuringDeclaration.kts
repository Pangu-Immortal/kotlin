val (abc, def) = A()

val rv = abc + def

class A {
    operator fun component1() = 1
    operator fun component2() = 2
}

// expected: rv: 3