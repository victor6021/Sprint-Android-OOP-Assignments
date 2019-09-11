package com.example.generics

import com.example.generics.Box as Box

open class Phone

class Tmobile:Phone()

class Att:Phone()

class Verizon:Phone()

class Box<P: Phone>(private var phone: Phone)

val phone = Phone()
val tmobile = Tmobile()
val att = Att()
val verizon = Verizon()

val phoneBox = Box<Phone>(phone)
val tmobileBox = Box<Phone>(tmobile)
val attBox = Box<Phone>(att)
val verizonBox = Box<Phone>(verizon)