package com.ttnd.demo.CO

import grails.validation.Validateable

class RegisterCO implements Validateable{
    String firstName
    String lastName
    String userName
    String email
    String password
    String confirmPassword    

    static constraints = {
        userName(nullable: false, blank: false)
        firstName(nullable: false, blank: false)
        lastName(nullable: false, blank: false)
        email(email: true, nullable: false, blank: false)
        password(nullable: false, blank: false)

    }
}
