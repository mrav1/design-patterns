### Object pool pattern
- Keeping initialized objects in the pool ready to use.
- Returning the object on which the client performed operations back to the pool.
- Not creating costly classes repeatedly to create, at once created expensive objects are returned back to the pool.

### when to use it
- You must create objects that are expensive to create.
- The frequency of creating further objects is also high.
- The number of objects in use is small.