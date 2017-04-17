package com.example

class Vehicle {

    Integer year
    
    String name
    
    Make make
    Model model
    
    static constraints = {
        name maXSize: 255
        year min:1900
    }
}
