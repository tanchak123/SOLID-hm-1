# My description to homework
##### I will consistently write the code point by point referring to the principles of SOLID. GOOD LUCK HAVE FUN :)
## 1. Single Responsibility principle:
+ Create abstract class "Machine" that is responsible for filling the fields.
+ Create class "MachineServiceImpl' that is responsible for basic function for consumer.
+ RESULT: 
*     We see 2 classes that is responsible for one 
      specific task.
+ Advantage: class is much easier to explain, understand and implement than the ones that provide 
a solution for everything.
## 2. Open/Closed principle:
+ Create single generic interface "MachineService" with two cores functions.
+ Create two new extends interfaces for imagination of addition of core functions.
+ RESULT: 
*     We have 2 new interfaces that complement 
      "MachineService", but don't change it.
+ Advantage: It helps us to reduce count of repeatable code.
## 3. Barbara Liskov substitution principle:
+ Let's try to create implementation of our 3 Service's interfaces.
+ We can't do it because our generic interface can't find model Car or Bus.
+ Let's create it with extends from our 'CORE' model "Machine".
+ For better imagination of this principle let's create counter of created models of machines on class "Machine".
+ So, any time when we create Machine or Car or Bus our counter will increase.
+ It means that before we launch Car or Bus constructor, we launch the constructor of class "Machine"
+ RESULT: 
    *     Pricniple says that we should create objects like this:
          Machine machine = new Bus();
          Bus bus = (Bus) machine;
          or
          BusService busService = new BusServiceImpl();
+ I think you see a disadvantage of this principle. U should to cast extends objects :(
+ So if u want create model u need make model abstract class
+ Advantage: For future changes it's enough create new implementation of interface and remove last part of expression.
          It gives us re-usability, reduced coupling, and easier maintenance of our code.
    
## 4. Interface Segregation principle:
   - Let's create interface with all methods form MachineService 
   and CarService(package = "main.badpractice')
   - RESULT:
   *     We see that we need realize ALL methods, 
         even if we don't need it.
         So it reduces the readability and maintainability.
   - Advantage: It helps not depend on implementation of all methods at once. We are reducing our class implementation 
   only to required actions without any additional or unnecessary code.
   
       
      
## 5. Dependency Inversion principle:
   - To implement this principle, I want create on our CarServiceImpl class next ref :
   *     MachineService<Machine> machineService;
   - Let's link this reference: 
   *     public CarServiceImpl(MachineService<Machine> machineService) {
             this.machineService = machineService;
         }
   - Let's create update of MachineServiceImpl with new function :
    Wi-Fi and Tv turn on when car start move and turn off when stop.
   - Don't forget make some change of model Machine(btw principle number 2).
   - Created class implements MachineServiceUpdate
   - Create class "Example" with psvm method and run 'start' method with two implmenets("updateMachine" and "machine".
   *     MachineServiceImpl
         BEFORE
         TV :: false
         Wi-Fi :: false
         RUNNING? :: false
         AFTER
         TV :: false
         Wi-Fi :: false
         RUNNING? :: true
         MachineServiceUpdateImpl
         BEFORE
         TV :: false
         Wi-Fi :: false
         RUNNING? :: false
         AFTER
         TV :: true
         Wi-Fi :: true
         RUNNING? :: true
   - We see hard link
   - Now we should create props.properties on resources
   - Run method 'startWithProps'.
   - RESULT :
   *     MachineServiceImpl
         BEFORE
         TV :: false
         Wi-Fi :: false
         RUNNING? :: false
         AFTER
         TV :: false
         Wi-Fi :: false
         RUNNING? :: true
         MachineServiceUpdateImpl
         BEFORE
         TV :: false
         Wi-Fi :: false
         RUNNING? :: false
         AFTER
         TV :: true
         Wi-Fi :: true
         RUNNING? :: true
   - Advantage: Maintainability, Testability, Readability, Flexibility, Extensibility, Team-ability.
   
# RESULT OF WORK :
### 1. Refreshed knowledge in so many forgotten places.
### 2. Learn some features with Generics.
### 3. Great example of SOLID principles understanding.
