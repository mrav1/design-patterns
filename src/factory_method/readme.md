### Factory method pattern
- According to GoF, **this pattern defines an interface for creating an object, but let subclasses decide which class to instantiate. The Factory method lets a class defer instantiation to subclasses**
- This pattern delegates the responsibility of initializing a class from the client to a particular factory class by creating a type of virtual constructor.
- To achieve this, we rely on a factory which provides us with the objects, hiding the actual implementation details. The created objects are accessed using a common interface.

### when to use it
- When the implementation of an interface or an abstract class is expected to change frequently.
- When the current implementation cannot comfortably accommodate new change.
- When the initialization process is relatively simple, and the constructor only requires a handful of parameters.
