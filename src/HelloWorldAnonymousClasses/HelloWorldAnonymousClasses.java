/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HelloWorldAnonymousClasses;

/**
 *
 * @author Cristi
 */
public class HelloWorldAnonymousClasses {
    //inner interface HelloWorld
    interface HelloWorld {
        public void greet();
        public void greetSomeone(String someone);
    }
  
    //method sayHello()
    public void sayHello() {
        
        //local class EnglishGreeting implemented in the sayHello() method
        class EnglishGreeting implements HelloWorld {
            String name = "world";
            @Override
            public void greet() {
                greetSomeone("world!");
            }
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hello " + name);
            }
        }
        //local class FrenchGreeting implemented in the sayHello() method
        class FrenchGreeting implements HelloWorld {
            String name = "tout le monde";
            @Override
            public void greet() {
                greetSomeone("tout le monde!");
            }
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Bonjour " + name);
            }
        }
        //local class SpanishGreeting implemented in the sayHello() method
        class SpanishGreeting implements HelloWorld {
            String name = "mundo";
            @Override
            public void greet() {
                greetSomeone("mundo!");
            }
            @Override
            public void greetSomeone(String someone) {
                name = someone;
                System.out.println("Hola " + name);
            }
        }
        //creating objects/instances for all classes
        HelloWorld englishGreeting = new EnglishGreeting();
        HelloWorld frenchGreeting = new FrenchGreeting();
        HelloWorld spanishGreeting = new SpanishGreeting();
        
        //calling the local classes methods
        englishGreeting.greet();
        frenchGreeting.greetSomeone("Fred");
        spanishGreeting.greet();
    }
    //main method
    public static void main(String[] args) {
        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
        myApp.sayHello();
    } 
}