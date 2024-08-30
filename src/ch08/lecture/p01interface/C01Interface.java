package ch08.lecture.p01interface;

public class C01Interface {

}

interface Aquatic1 {
}

interface Beast1 {

}

//@formatter:off
class Animal1 {
}
class Fish1 extends  Animal1{

}
class Shark1 extends  Fish1 implements  Aquatic1 , Beast1{}

class Nimo1 extends  Fish1 implements  Aquatic1{}

class Mammal1 extends  Animal1{}

class Tiger extends  Mammal1 implements  Beast1{}

class Maltese extends  Mammal1{}

class Whale extends  Mammal1 implements  Aquatic1{}

