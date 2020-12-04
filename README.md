# 深入浅出设计模式

## 策略模式 Strategy Pattern
放在介绍章来讲确实很好理解，而且看完后也在工作的项目中用起来了，主要是可维护性强，
添加新算法只需要再写一个实现了`Strategy`的类即可，其他地方的代码都不需要改变。
### 定义
> **The Strategy Pattern** defines a family of algorithms, encapsulates each one, and makes them interchangeable.
> Strategy lets the algorithm vary independently from clients that use it.
### Class Diagram
![策略模式类图](imgs/StrategyPatternClassDiagram.jpg)


## 观察者模式 Observer Pattern
### 定义
> **The Observer Pattern** defines a one-to-many dependency between objects so that when one obejct changes state, all of its dependents are notified and updated automatically.
### Class Diagram
![观察者模式类图](imgs/ObserverPattern.jpg)

## 装饰者模式 Decorator Pattern
感觉一直在强调程序要可以在`Runtime`下修改，而不是`compile`下。 Java I/O的相关类是使用了观察者模式
### 定义 
> **The Decorator Pattern** attaches additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

### Class Diagram


