package ch13.sec05;

public class Person { }

//상속관계 지정 
//Person -> Worker | Student
class Worker extends Person { }
class Student extends Person { }
//Student -> HighStudent | MiddleStudent
class HighStudent extends Student { }
class MiddleStudent extends Student { }
