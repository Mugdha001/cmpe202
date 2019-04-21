# CMPE 202 Lab 9 : Implementing Lambda Functions

## Comparison

### Orginal

Decorator pattern adds some behavior to an object dynamically at run time. I have referenced the code of Decorator pattern in Prof Paul's Github repo. The implementation wraps a text with HTML tags. We use `Decorator` to accept `Component` object and derive `operation()` this Decorator was extended for to `ConcreteDecoratorA` and `ConcreteDecoratorB`. Both the ConcreteDecorators wrap a certain HTML around the `Component` object passed to it.

### Using Lamda Function

Now using lamda funtions in the same implementation we now use lamda funtion to add a behavior to an object. These function wrap the content of the object with some HTML tag. Example lamda function below :

```java
Function<String, String> em = (input) -> "<em>" + input + "</em>"; 
```

Using this function eliminates the need to create `Decorator`, `ConcreteDecoratorA` & `ConcreteDecoratorB` classes making the code simple and consise.


