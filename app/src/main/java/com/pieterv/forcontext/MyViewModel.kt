package com.pieterv.forcontext

class MyContextClass {
    fun sayHello() {
        val instance = Hello()
        instance.helloWorld()
    }
}

class NotTheContextClass {
    fun sayHello() {
        val instance = Hello() // won't compile
        instance.helloWorld()
    }
}


context(MyContextClass) // can only be used from MyContextClass
class Hello {
    fun helloWorld() {
        //you know what todo
    }
}