# INTERFACES
🔸 1. What is an Interface?
An interface in Java is a collection of abstract methods (and from Java 8 onward, also default and static methods) that define a contract for classes to follow.

A class that implements an interface must define all abstract methods.

🔸 2. Abstract Method
An abstract method is a method with no body, just a name. It is meant to be overridden by the class that implements the interface.

🔸 3. Default Method (in interface)(type of non abstract method)
A default method in an interface is a non-abstract method with a body, introduced in Java 8.
It allows interfaces to have methods with code that can be inherited.

🔸 4. Static Method (in interface)(type of non abstract method)
A static method in an interface belongs to the interface itself, not to objects.
It must be called using the interface name.

🔹 5. Class COW implements both ANIMAL and HERBIVORE
It must:

Override the abstract methods walk() and eat() from ANIMAL

Can use the default method green() from HERBIVORE

Can call the static method from HERBIVORE directly using the interface name

🔹 6. Main class:
Creates a COW object and calls bydefault() method to execute everything:
