### Chain of responsibility pattern
- Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.
  Launch-and-leave requests with a single processing pipeline that contains many possible handlers.
  An object-oriented linked list with recursive traversal.
  
### when to use it
- Need to efficiently process the requests without hard-wiring handler relationships and precedence, or request-to-handler mappings.