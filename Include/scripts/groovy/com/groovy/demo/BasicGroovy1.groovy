package com.groovy.demo

import com.googlecode.javacv.CanvasFrame.Exception

println  "  Hello World...!"

// Variables
def name = "Groovy"

println name

println 'name is '+name
println 'name is ${name}'
println "name is ${name}"

// Groovy is case sensitive
def x = 10
def X = 20
println x
println X

x = "Automation"
println x

// Multiple Assignment
def (a, b, c) = [30, 40, 50]
println a
println b
println c

def (String p, int q, Double r) = [30, 40]
println p
println q
println r


/****************************************/


// conditional statements
// if-else
// switch


def num = 10

if (num == 10){
	println "Number is 10"
}else{
	println "Number is not 10"
}

num = 0

if (num > 0){
	println "Num is +ve"
}else if(num == 0){
	println "Num iz zero"
}else{
	println "Num is -ve"
}

def result = ""
switch(num){
	
	case 0:
	result = "num is 0"
	break;
	
	case 1:
	result = "num is 1"
	break;
	
}

println result


// methods


def hello(){
	
	println " Hello World"
}

hello()


def helloUser(String user){
	
	println " Hello "+user
}

helloUser("Groovy")



def add(int a=5, int b=6){
	println "Sum is : "+(a+b)
}

add(2, 3)
add()
add(7)




























